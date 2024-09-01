package com.jt.employee_registration;

import java.time.LocalDate;

import org.springframework.web.multipart.MultipartFile;

public record EmployeeDetails(
                String firstName,
                String middleName,
                String lastName,
                LocalDate dob,
                String gender,
                String personalEmail,
                String workEmail,
                String phoneNumber,
                String emergencyContactName,
                String emergencyContactRelationship,
                String emergencyContactNumber,
                String employmentDepartment,
                String jobTitle,
                LocalDate startDate,
                String managerName,
                String previousEmployer,
                MultipartFile employeeImage) {
}