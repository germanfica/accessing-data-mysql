package com.germanfica.accessingdatamysql.repository;

import com.germanfica.accessingdatamysql.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
