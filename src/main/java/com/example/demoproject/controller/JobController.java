package com.example.demoproject.controller;

import com.example.demoproject.protocol.request.JobsAddRequest;
import com.example.demoproject.protocol.request.search.SearchJobs;
import com.example.demoproject.protocol.response.common.RtnObject;
import com.example.demoproject.service.JobService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "JobController", description = "직업관리")
@RequestMapping(value = "/api/job")
public class JobController {
    @Autowired
    JobService jobService;

    @ApiOperation(value = "jobList", notes = "jobList")
    @GetMapping("/list")
    public RtnObject getJobList(SearchJobs search, Sort sort) {
        return jobService.searchList(search, sort);
    }

    @ApiOperation(value = "jobList", notes = "jobList")
    @GetMapping("/page")
    public RtnObject getJobList(SearchJobs search, Pageable page) {
        return jobService.searchPage(search, page);
    }

    @ApiOperation(value = "JobAdd", notes = "JobAdd")
    @PostMapping("/add")
    public RtnObject<JobsAddRequest> addJob(@RequestBody JobsAddRequest request) {
        return jobService.save(request);
    }

    @ApiOperation(value = "jobList", notes = "jobList")
    @PutMapping("/update")
    public String updateJob() {
        return "jobList";
    }

    @ApiOperation(value = "jobList", notes = "jobList")
    @DeleteMapping("/delete")
    public String deleteJob() {
        return "jobList";
    }
}
