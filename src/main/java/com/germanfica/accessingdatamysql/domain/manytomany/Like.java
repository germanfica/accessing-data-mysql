package com.germanfica.accessingdatamysql.domain.manytomany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.germanfica.accessingdatamysql.embeddable.LikeId;
import lombok.*;
import javax.persistence.*;

// https://docs.jboss.org/hibernate/orm/current/userguide/html_single/Hibernate_User_Guide.html#associations-many-to-many-bidirectional-with-link-entity
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Likes")
@Table(name = "likes")
public class Like {
    @EmbeddedId
    private LikeId id;

    @Getter(value = AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("userId") //  maps the userId attribute of embedded id
    private User user;

    @Getter(value = AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("bookId")  //  maps the bookId attribute of embedded id
    private Book book;

    @Column(name = "name", nullable = true)
    private String name;

    @JsonBackReference
    private User getUser() {
        return this.user;
    }

    @JsonBackReference
    private Book getBook() {
        return this.book;
    }
}
