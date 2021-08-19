package com.germanfica.accessingdatamysql.domain.manytomany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "User")
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    @Getter(value = AccessLevel.NONE)
    @OneToMany(mappedBy = "user", cascade={
            CascadeType.PERSIST,
            CascadeType.REMOVE
    })
    private List<Like> likes = new ArrayList<>();

    @JsonManagedReference
    public List<Like> getLikes() {
        return likes;
    }
}
