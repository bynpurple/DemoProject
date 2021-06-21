package com.example.demoproject.protocol.request;

import com.example.demoproject.domain.Jobs;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobsAddRequest {
    private String jobId;
    private String jobName;
    private String jobCategoryId;

    public Jobs convertJob() {
        Jobs ret = new Jobs();
        ret.setJobName(jobName);
        ret.setJobCategoryId(jobCategoryId);
        return ret;
    }
}
