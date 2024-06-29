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
}
