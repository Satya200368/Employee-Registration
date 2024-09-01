package com.jt.employee_registration;

import java.util.List;

import lombok.Data;

@Data
public class HomePageResponse {
    private List<EmployeeDetailsModel> employees;
    private int currentPage;
    private int totalPage;
}
