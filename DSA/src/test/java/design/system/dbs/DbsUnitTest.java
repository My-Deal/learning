package design.system.dbs;

import design.system.DeskBookingSystem.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class DbsUnitTest {
    private BuildingInterface building;
    private TeamInterface teamInterface;
    private BookingInterface bookingInterface=new Booking();

    @BeforeClass
    public void setUp() {
        String[] rows = {"A", "B", "C", "D", "E"};
        String[] column = {"1", "2", "3", "4", "5"};
        Floor floor1 = new Floor("L0", rows, column);
        Floor floor2 = new Floor("L1", rows, column);
        Floor floor3 = new Floor("L2", rows, column);
        Floor floor4 = new Floor("L3", rows, column);
        Floor floor5 = new Floor("L4", rows, column);
        Set<Floor> floors = new HashSet<>();
        floors.add(floor1);
        floors.add(floor2);
        floors.add(floor3);
        floors.add(floor4);
        floors.add(floor5);

        building = new Building("Buidling1", new Address("306", "Lane 3", "block5",
                "Near Metro", "Gurgaon", "Haryana", "122006", "India"), "ABC", floors);
        Employee employee1 = new Employee("virendra", "N-001");
        Employee employee = new Employee("Sushil", "N-002");
        teamInterface = new Team(employee, Set.of(employee1));
    }

    @Test
    public void shouldGetCorrectAvailableDesk(){

    }
}
