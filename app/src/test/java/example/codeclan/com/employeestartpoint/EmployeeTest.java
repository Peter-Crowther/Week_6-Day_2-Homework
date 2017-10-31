package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {
    Employee employee;
    Manager manager;

    @Before
    public void before() {
        employee = new Employee(1, "Wilma", "AB123456C", 30000.00 );
        manager  = new Manager(2, "Campbell", "AD123456D",45000.00, "Mailroom" );
    }

    @Test
    public void canGetEmployeeId() {
        assertEquals(1, employee.getId());
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals("Wilma", employee.getName());
    }

    @Test
    public void canGetEmployeeSSn() {
        assertEquals("AB123456C", employee.getSocialSecurityNumber());
    }

    @Test
    public void canRaiseSalary() {
        employee.increaseSalary();
        assertEquals(35000.00, employee.getSalary(), 0.001);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Mailroom", manager.getDeptName());
    }



}
