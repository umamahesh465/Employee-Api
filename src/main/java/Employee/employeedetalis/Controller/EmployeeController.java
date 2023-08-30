package Employee.employeedetalis.Controller;


import Employee.employeedetalis.Service.EmployeeService;
import Employee.employeedetalis.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("employeeDetails")
   public List<Employee> getEmployeeDetails(@RequestBody Employee employee){

        Employee employee1=new Employee();
        Employee employee2=new Employee();
        List<Employee> employees=new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);

        return  employeeService.saveEmployee(employee);
}

      @GetMapping("{id}")
     public ResponseEntity<Optional<Employee>> getByID(@PathVariable Long id){
        Optional<Employee> employee=employeeService.getByEmpId(id);
        return ResponseEntity.ok(employee);
     }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("Employee deleted successfully");
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long employeeId, @RequestBody Employee updatedEmployee) {
        Employee updated = employeeService.updateEmployee(employeeId, updatedEmployee);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }
}
