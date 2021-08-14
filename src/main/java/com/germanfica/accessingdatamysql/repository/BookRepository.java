package com.germanfica.accessingdatamysql.repository;

import com.germanfica.accessingdatamysql.domain.manytomany.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
