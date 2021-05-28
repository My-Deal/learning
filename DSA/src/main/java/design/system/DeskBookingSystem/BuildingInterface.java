package design.system.DeskBookingSystem;

import java.util.Set;

public interface BuildingInterface {
    public String getName();

    public Address getAddress();

    public String getOwner();

    public Floor getFloor(String number);

    public Set<Floor> getFloors();
}
