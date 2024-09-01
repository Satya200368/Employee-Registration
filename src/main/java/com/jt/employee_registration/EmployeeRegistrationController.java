package com.jt.employee_registration;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class EmployeeRegistrationController {
    private final EmployeeRepository repository;

    @GetMapping({ "/", "/home" })
    public String home(Model model, @RequestParam(required = false, defaultValue = "1") int pageNum) {

        final int limit = 10;
        var employeeDetails = repository.findAll(PageRequest.of(pageNum - 1, limit));
        int totalEmployee = (int) repository.count();

        var homePageResponse = new HomePageResponse();
        homePageResponse.setEmployees(employeeDetails.getContent());
        homePageResponse.setCurrentPage(pageNum);
        homePageResponse.setTotalPage(getTotalPage(totalEmployee, limit));
        model.addAttribute("response", homePageResponse);
        return "home";
    }

    @GetMapping("/registration")
    public String registration() {

        return "form";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute EmployeeDetails details) {

        var employeeDetailsModel = EmployeeMapper.convertEmployeeDetailsTEmployeeDetailsModel(details);
        System.out.println(employeeDetailsModel);
        repository.save(employeeDetailsModel);
        return "redirect:/home";
    }

    private int getTotalPage(int totalBlogs, int limit) {
        return (totalBlogs % limit == 0)
                ? (totalBlogs / limit)
                : (totalBlogs / limit) + 1;
    }
}
