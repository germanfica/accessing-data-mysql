package com.germanfica.accessingdatamysql.repository;

import com.germanfica.accessingdatamysql.domain.manytomany.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    @Query(value = "SELECT u FROM User u")
    List<User> findAllUsers();
}
