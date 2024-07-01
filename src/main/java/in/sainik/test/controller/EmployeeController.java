package in.sainik.test.controller;
import java.util.*;
import in.sainik.test.model.Employee;
import in.sainik.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService emp;
    @PostMapping
    public Employee save(@RequestBody Employee employee){
    return emp.save(employee);
    }

@GetMapping
public List<Employee> getAll(){
        return emp.getAll();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable  String id){
        return emp.getEmployeeById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable String id){
        return emp.deleteEmployee(id);
    }
}


