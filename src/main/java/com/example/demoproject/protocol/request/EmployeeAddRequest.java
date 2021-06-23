package com.example.demoproject.protocol.request;

import com.example.demoproject.domain.employee.NuxtEmployees;
import com.example.demoproject.domain.job.Jobs;
import com.mysql.cj.util.StringUtils;
import lombok.Data;

@Data
public class EmployeeAddRequest {
    public String empId;
    public String empName;
    public String empNo;
    public String phoneNumber;

    public NuxtEmployees convertRequest() {
        NuxtEmployees ret = new NuxtEmployees();

        if(!StringUtils.isNullOrEmpty(empId)) ret.setId(empId);
        ret.setId(empNo);
        if(!StringUtils.isNullOrEmpty(empNo)) ret.setEmpNo(empNo);
        ret.setEmpName(empName);
        ret.setEmpPhoneNumber(phoneNumber);

        return ret;
    }
}
