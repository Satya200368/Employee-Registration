package com.jt.employee_registration;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EmployeeDetailsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dob;
    private String gender;
    private String personalEmail;
    private String workEmail;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactRelationship;
    private String emergencyContactNumber;
    private String employmentDepartment;
    private String jobTitle;
    private LocalDate startDate;
    private String managerName;
    private String previousEmployer;
    private String employeeImag;
}
