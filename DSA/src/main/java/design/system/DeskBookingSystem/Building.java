package design.system.DeskBookingSystem;

import java.util.Set;

public class Building implements BuildingInterface{
    private String name;
    private Address address;
    private String owner;
    private Set<Floor> floors;

    public Building(String name, Address address, String owner,Set<Floor> floors) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.floors=floors;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getOwner() {
        return owner;
    }

    public Floor getFloor(String number){
        if(floors!=null){
        return    floors.stream().filter(floor -> floor.getFloorNumber().equals(number)).findFirst().get();
        }
        return null;
    }

    @Override
    public Set<Floor> getFloors() {
        return floors;
    }
}
