package com.jt.employee_registration;

import org.springframework.beans.BeanUtils;

public class EmployeeMapper {
    
    public static EmployeeDetailsModel convertEmployeeDetailsTEmployeeDetailsModel(EmployeeDetails details){

        var employeeDetailsModel = new EmployeeDetailsModel();

        BeanUtils.copyProperties(details, employeeDetailsModel);

        return employeeDetailsModel;
    }
}
