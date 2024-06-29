package in.sainik.test.controller;

import in.sainik.test.model.Employee;
import in.sainik.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService emp;
    @PostMapping
    public Employee save(@RequestBody Employee employee){
    return emp.save(employee);
    }
}
