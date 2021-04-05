package example.micronaut;

import io.micronaut.data.annotation.*;
import io.micronaut.data.repository.CrudRepository;

@Repository
interface EmployeeRepository extends CrudRepository<Employee, Long> {
}