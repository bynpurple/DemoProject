package com.example.demoproject.controller;

import com.example.demoproject.protocol.request.EmployeeAddRequest;
import com.example.demoproject.protocol.request.JobsAddRequest;
import com.example.demoproject.protocol.response.common.RtnObject;
import com.example.demoproject.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "EmployeeController", description = "회원 관리")
@RequestMapping(value = "/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "jobList", notes = "jobList")
    @PostMapping("/add")
    public RtnObject<EmployeeAddRequest> addEmployee(@RequestBody EmployeeAddRequest request) {
        return new RtnObject(employeeService.save(request), true, "addEmployee");
    }

}
