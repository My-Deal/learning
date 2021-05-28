package design.system.DeskBookingSystem;

public final class Desk implements DeskAllocationInterface{
    private String name;
    private String row;
    private String column;
    private Boolean allocated;
    private Employee allocatedTo;

    public Desk(String floorNumber, String row, String column) {
        this.name = floorNumber+"-"+row+"-"+column;
        this.row = row;
        this.column = column;
    }

    public String getName() {
        return name;
    }

    public String getRow() {
        return row;
    }

    public String getColumn() {
        return column;
    }

    @Override
    public boolean isAllocated() {
        return allocated;
    }

    @Override
    public boolean allocate(Employee employee) {
        if(employee!=null)
        {
            return false;
        }
        else{
            this.allocatedTo=employee;
            return true;
        }
    }

}
