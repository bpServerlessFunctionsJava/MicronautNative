package example.micronaut;
import io.micronaut.core.annotation.Introspected;

import javax.persistence.*;

@Introspected
@Entity
@Table(name = "EmployeeMicronaut")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    public Employee() {
    }

    public Employee(Integer empId, String name, String email) {
        this.id = empId;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
