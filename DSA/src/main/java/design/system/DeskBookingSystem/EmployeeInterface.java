package design.system.DeskBookingSystem;

public interface EmployeeInterface {

    String getEmployeeName();

    String getEmployeeCode();

    String getDeskNumber();

    boolean assignDesk(String deskNumber);
}
