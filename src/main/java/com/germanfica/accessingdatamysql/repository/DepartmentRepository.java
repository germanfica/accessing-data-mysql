package com.germanfica.accessingdatamysql.repository;

import com.germanfica.accessingdatamysql.domain.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
