package bit.javaoop.managers;

import bit.javaoop.employees.Employee;
import org.junit.jupiter.api.Test;

class ManagerTest {

    @Test
    void ShouldHireEmployee() {
        //given
        Employee employee = new Employee("Dobry pracownik", 22000);
        EmployeeManager manager = new EmployeeManager("Miły menadżer", 45000, 30);
        //when
        manager.hireEmployee(employee);
    }
}