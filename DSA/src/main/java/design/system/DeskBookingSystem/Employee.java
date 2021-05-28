package design.system.DeskBookingSystem;

public final class Employee implements EmployeeInterface{
    private String name;
    private String employeeCode;
    private String seatNumber;

    public Employee(String name, String employeeCode) {
        this.name = name;
        this.employeeCode = employeeCode;
    }


    @Override
    public String getEmployeeName() {
        return name;
    }

    @Override
    public String getEmployeeCode() {
        return employeeCode;
    }

    @Override
    public String getDeskNumber() {
        return seatNumber;
    }

    @Override
    public boolean assignDesk(String deskNumber) {
        this.seatNumber=deskNumber;
        return true;
    }
}
