package in.sainik.test.service;
import java.util.*;
import in.sainik.test.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    List<Employee> employeeList = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if(employee.getEmpId() == null || employee.getEmailId().isEmpty()){
            employee.setEmpId(UUID.randomUUID().toString());
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employeeList.stream().filter(e->e.getEmpId().equalsIgnoreCase(id)).findFirst().orElseThrow(()->new RuntimeException("Emoplyee not found with the given id"));
    }

    @Override
    public String deleteEmployee(String id) {
        Employee emp = employeeList.stream().filter(e->e.getEmpId().equalsIgnoreCase(id)).findFirst().get();
        employeeList.remove(emp);
        return ("Deleted employee with id:"+id);
    }
}
