package com.example.demoproject.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Jobs")
@Getter
@Setter
@ToString
public class Jobs{
    @Id
    private String Id = UUID.randomUUID().toString();

    private char UseYn = 'Y';

    private Date RegDate = new Date();

    private String RegEmpNo;

    private String JobName;

    private String JobCategoryId;
}
