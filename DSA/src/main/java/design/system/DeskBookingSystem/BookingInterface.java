package design.system.DeskBookingSystem;

import java.util.List;

public interface BookingInterface {

    public boolean isDeskAvailable(String floor);

    public String allocateDesk(Employee employee);

    public boolean deAllocateDesk(Employee employee);

    public String[] allocateDesks(Team team);

    public List<String> availableDesks(String Building);
}
