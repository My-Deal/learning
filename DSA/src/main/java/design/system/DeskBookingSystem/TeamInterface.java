package design.system.DeskBookingSystem;

import java.util.Set;

public interface TeamInterface {

    void addEmployee(Employee employee,boolean isLeader);

    boolean removeEmployee(Employee employee);

    Set<Employee> getEmployees();
}
