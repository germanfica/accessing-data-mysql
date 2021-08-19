package com.germanfica.accessingdatamysql.domain.manytomany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

//    @Getter(value = AccessLevel.NONE)
//    @OneToMany(mappedBy = "book")
//    private List<Like> likes = new ArrayList<>();
//
//    @JsonManagedReference
//    public List<Like> getLikes() {
//        return likes;
//    }
}
