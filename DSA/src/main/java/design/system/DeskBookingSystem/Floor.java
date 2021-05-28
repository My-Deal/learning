package design.system.DeskBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private String floorNumber;
    private List<Desk> seats;

    public Floor(String floorNumber, String [] rows,String [] column) {
        this.floorNumber = floorNumber;
        createSeats(floorNumber,rows,column);
    }
    private void createSeats(String floorNumber,String[] rows,String[] column){
        seats=new ArrayList<>();
        for (int i=0;i<rows.length;i++){
            for (int j=0;j<column.length;j++){
                seats.add(new Desk(floorNumber,rows[i],column[j]));
            }
        }
    }

    public Desk getDesk(String deskNo){
       return seats.stream().filter(desk-> desk.getName().equals(deskNo)).findFirst().get();
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public List<Desk> getSeats(){
        return seats;
    }
}
