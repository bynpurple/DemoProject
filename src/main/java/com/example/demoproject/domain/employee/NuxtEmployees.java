package com.example.demoproject.domain.employee;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "nuxt_employees")
@Data
public class NuxtEmployees {
    @Id
    public String id;

    public String empName;

    public String empNo;

    public String empPhoneNumber;

    public Date regDate = new Date();

    public String empState;
}
