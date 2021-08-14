package com.germanfica.accessingdatamysql.repository;

import com.germanfica.accessingdatamysql.domain.onetomany.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
