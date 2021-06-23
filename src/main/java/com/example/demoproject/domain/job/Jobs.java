package com.example.demoproject.domain.job;

import com.example.demoproject.domain.employee.NuxtEmployees;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "jobs")
@Data
public class Jobs {
    @Id
    public String id = UUID.randomUUID().toString();

    public String useYn;

    // @Type  type = true_false, yes_no
    // @NotNull

    public Date regDate;

    public String regEmpId;

    @JoinColumn(name = "regEmpId", insertable = false, updatable = false)
    @ManyToOne(targetEntity = NuxtEmployees.class)
    public NuxtEmployees regEmpInfo;

    public String jobName;

    public String jobCategoryId;
}
