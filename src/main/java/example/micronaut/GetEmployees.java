package example.micronaut;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;

import javax.inject.Inject;

@Introspected
public class GetEmployees extends MicronautRequestHandler<String, Iterable<Employee>> {
    @Inject
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> execute(String input) {
        return employeeRepository.findAll();
    }
}
