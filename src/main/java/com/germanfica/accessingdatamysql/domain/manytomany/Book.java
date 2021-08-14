package com.germanfica.accessingdatamysql.domain.manytomany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity(name = "Book")
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;

    @Getter(value = AccessLevel.NONE)
    @ManyToMany(mappedBy = "books")
    private List<User> users = new ArrayList<>();

    @JsonBackReference
    public List<User> getUsers() {
        return this.users;
    }
}
