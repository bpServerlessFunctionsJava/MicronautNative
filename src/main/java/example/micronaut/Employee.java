package example.micronaut;
import io.micronaut.core.annotation.Introspected;

import javax.persistence.*;

@Introspected
@Entity
@Table(name = "EmployeeMicronaut")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    @ManyToOne
    @JoinColumn(name = "supervisorId")
    private Employee supervisor;

    public Employee() {
    }

    public Employee(int empId, String name, String email, Employee supervisor) {
        this.id = empId;
        this.name = name;
        this.email = email;
        this.supervisor = supervisor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }
}
