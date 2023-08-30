package Employee.employeedetalis.pojo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<String> phnNumbers;
    private String doj;
    private double salary;


    public Employee(){

}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhnNumbers() {
        return phnNumbers;
    }

    public List<String>setPhnNumbers(List<String> phnNumbers) {
        List<String> phnNumbers=new ArrayList<>();
        phnNumbers.add("984562");
        phnNumbers.add("74859630");
        this.phnNumbers = phnNumbers;
        return setPhnNumbers(updatedEmployee.getPhnNumbers());
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phnNumbers=" + phnNumbers +
                ", doj='" + doj + '\'' +
                ", salary=" + salary +
                '}';
    }


}
