package in.sainik.test.service;

import in.sainik.test.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> getAll();

    Employee getEmployeeById(String id);

    String deleteEmployee(String id);
}
