package com.example.demoproject.repository;

import com.example.demoproject.domain.employee.NuxtEmployees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<NuxtEmployees, String>, QuerydslPredicateExecutor<NuxtEmployees> {
}
