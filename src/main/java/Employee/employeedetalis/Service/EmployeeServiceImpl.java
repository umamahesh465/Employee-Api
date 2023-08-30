package Employee.employeedetalis.Service;

import Employee.employeedetalis.Dao.EmployeeDao;
import Employee.employeedetalis.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class EmployeeServiceImpl implements EmployeeService{


    private EmployeeDao employeeDao;
    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> saveEmployee(Employee employee) {
        return (List<Employee>) employeeDao.save(employee);
    }

    @Override
    public Optional<Employee> getByEmpId(Long id) {
        return employeeDao.findById(id);
    }

    @Override
    public void deleteEmployee(Long employeeId) {

    }

    @Override
    public Employee updateEmployee(Long employeeId, Employee updatedEmployee) {

        Optional<Employee> existingEmployeeOptional=employeeDao.findById(employeeId);
        Employee existingEmployee = existingEmployeeOptional.get();
        existingEmployee.setId(updatedEmployee.getId());
        existingEmployee.setFirstName(updatedEmployee.getFirstName());
        existingEmployee.setLastName(updatedEmployee.getLastName());
        existingEmployee.setPhnNumbers(updatedEmployee.getPhnNumbers());
        existingEmployee.setDoj(updatedEmployee.getDoj());
        existingEmployee.setEmail(updatedEmployee.getEmail());


        return employeeDao.save(updatedEmployee);
    }

}
