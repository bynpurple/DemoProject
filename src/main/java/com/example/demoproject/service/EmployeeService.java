package com.example.demoproject.service;

import com.example.demoproject.domain.employee.NuxtEmployees;
import com.example.demoproject.protocol.request.EmployeeAddRequest;
import com.example.demoproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public NuxtEmployees save(EmployeeAddRequest request) {
        return employeeRepository.save(request.convertRequest());
    }
}
