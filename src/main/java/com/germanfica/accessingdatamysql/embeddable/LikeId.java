package com.germanfica.accessingdatamysql.embeddable;

import com.germanfica.accessingdatamysql.domain.manytomany.Book;
import com.germanfica.accessingdatamysql.domain.manytomany.User;
import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class LikeId implements Serializable {
    //@ManyToOne
    //private User user;

    //@ManyToOne
    //private Book book;
    private Integer userId; // corresponds to primary key type of User
    private Integer bookId; // corresponds to primary key type of Book
}