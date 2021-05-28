package design.system.DeskBookingSystem;

import java.util.HashSet;
import java.util.Set;

public class Team implements TeamInterface{
    private Employee leader;
    private Set<Employee> employees=new HashSet<>();

    public Team(Employee leader, Set<Employee> employees) {
        this.leader = leader;
        this.employees = employees;
    }


    @Override
    public void addEmployee(Employee employee,boolean isLeader) {
        if(leader==null){
            leader=employee;
        }

    }

    @Override
    public boolean removeEmployee(Employee employee) {
        return false;
    }

    @Override
    public Set<Employee> getEmployees() {
        return null;
    }
}
