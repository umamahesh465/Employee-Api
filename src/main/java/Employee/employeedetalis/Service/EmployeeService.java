package Employee.employeedetalis.Service;

import Employee.employeedetalis.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {


    List<Employee> saveEmployee(Employee employee);

    Optional<Employee> getByEmpId(Long id);

    void deleteEmployee(Long employeeId);

    Employee updateEmployee(Long employeeId, Employee updatedEmployee);
}
