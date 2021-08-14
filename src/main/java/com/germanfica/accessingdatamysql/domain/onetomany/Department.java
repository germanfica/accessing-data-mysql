package com.germanfica.accessingdatamysql.domain.onetomany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This entity is one-to-many
 *
 * One department houses many employees
 */
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Department")
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Getter(value = AccessLevel.NONE)
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @LazyCollection( LazyCollectionOption.EXTRA )
    private List<Employee> employees = new ArrayList<>();

    @JsonManagedReference
    private List<Employee> getEmployees() {
        return this.employees;
    }
}
