package design.system.DeskBookingSystem;

import java.util.*;
import java.util.stream.Collectors;

public final class Booking implements BookingInterface {
    private Map<String, Map<Employee, Desk>> deskAllocation = new HashMap<>();
    List<BuildingInterface> buildings = new ArrayList<>();


    public Booking(Building building) {
        initializeBuilding(building);
    }

    private void initializeBuilding(BuildingInterface building) {
        if (!deskAllocation.containsKey(building)) {
            buildings.add(building);
            deskAllocation.put(building.getName(), new HashMap<>());
        }
    }


    @Override
    public boolean isDeskAvailable(String floor) {
        return false;
    }

    @Override
    public String allocateDesk(Employee employee) {
        return null;
    }

    @Override
    public boolean deAllocateDesk(Employee employee) {
        return false;
    }

    @Override
    public String[] allocateDesks(Team team) {
        return new String[0];
    }

    @Override
    public List<String> availableDesks(String buildingName) {
       if(deskAllocation.containsKey(buildingName)){
          BuildingInterface buildingMatched= buildings.stream().filter(building->building.getName().equals(buildingName)).findFirst().orElse(null);
          if(buildingMatched!=null){
             // buildingMatched.getFloors().stream().map(floor->floor.getSeats().).map(desks->desks)
          }
         // deskAllocation.computeIfPresent()
       }
       return Collections.emptyList();
    }


}
