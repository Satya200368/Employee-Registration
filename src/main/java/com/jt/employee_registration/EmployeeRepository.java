package com.jt.employee_registration;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeDetailsModel, Integer> {
    
}
