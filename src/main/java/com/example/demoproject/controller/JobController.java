package com.example.demoproject.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Job", description = "JobController")
@RequestMapping(value = "/api/job")
public class JobController {

    @ApiOperation(value = "jobList", notes = "jobList")
    @GetMapping("/get-list")
    public String getList() {
        return "jobList";
    }
}
