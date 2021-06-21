package com.example.demoproject.service;

import com.example.demoproject.domain.Jobs;
import com.example.demoproject.protocol.request.JobsAddRequest;
import com.example.demoproject.repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    JobsRepository jobsRepository;

    public Optional<Jobs> getJob(String id) {
        return jobsRepository.findById(id);
    }

    public Jobs save(JobsAddRequest request) {
        return jobsRepository.save(request.convertJob());
    }

    @Transactional
    public Jobs delete(Jobs jobs) {
        jobs.setUseYn('N');
        return jobsRepository.save(jobs);
    }

    public Jobs update(Jobs jobs, JobsAddRequest request) {
        jobs.setJobName(request.getJobName());
        jobs.setJobCategoryId(request.getJobCategoryId());
        return jobsRepository.save(jobs);
    }
}
