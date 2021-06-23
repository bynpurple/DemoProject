package com.example.demoproject.service;

import com.example.demoproject.domain.job.Jobs;
import com.example.demoproject.protocol.request.JobsAddRequest;
import com.example.demoproject.protocol.request.search.SearchJobs;
import com.example.demoproject.protocol.response.common.RtnObject;
import com.example.demoproject.repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    JobsRepository jobsRepository;

    public Optional<Jobs> getJob(String id) {
        return jobsRepository.findById(id);
    }

    public RtnObject save(JobsAddRequest request) {
        return new RtnObject(jobsRepository.save(request.convertJob()), true, "Job Save!");
    }

    @Transactional
    public Jobs delete(Jobs jobs) {
        jobs.setUseYn('N');
        return jobsRepository.save(jobs);
    }

    @Transactional
    public Jobs update(Jobs jobs, JobsAddRequest request) {
        jobs.setJobName(request.getJobName());
        jobs.setJobCategoryId(request.getJobCategoryId());
        return jobsRepository.save(jobs);
    }

    public RtnObject<Page<Jobs>> searchPage(SearchJobs search, Pageable page) {
        return new RtnObject(jobsRepository.searchPage(search, page), true, "Job Page");
    }

    public RtnObject<List<Jobs>> searchList(SearchJobs search, Sort sort) {
        return new RtnObject(jobsRepository.searchList(search, sort), true, "job List");
    }
}
