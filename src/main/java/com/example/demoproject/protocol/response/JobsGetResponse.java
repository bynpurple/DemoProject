package com.example.demoproject.protocol.response;

import lombok.Data;

@Data
public class JobsGetResponse {
    private String id;
    private String jobName;
    private String jobCategoryName;
    private String RegEmpName;
    private String RegEmpNo;
}
