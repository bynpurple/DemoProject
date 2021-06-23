package com.example.demoproject.protocol.request.search;

import lombok.Data;

@Data
public class SearchEmployees {
    private String searchName;
    private String searchEmpNo;
}
