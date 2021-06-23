package com.example.demoproject.protocol.request;

import com.example.demoproject.domain.job.Jobs;
import com.mysql.cj.util.StringUtils;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobsAddRequest {
    private String jobId;
    private String jobName;
    private String jobCategoryId;
    private String regEmpNo;

    public Jobs convertJob() {
        Jobs ret = new Jobs();
        if(!StringUtils.isNullOrEmpty(jobId)) ret.setId(jobId);
        if(!StringUtils.isNullOrEmpty(regEmpNo)) ret.setRegEmpNo(regEmpNo);
        ret.setJobName(jobName);
        if(!StringUtils.isNullOrEmpty(jobCategoryId)) ret.setJobCategoryId(jobCategoryId);

        return ret;
    }
}
