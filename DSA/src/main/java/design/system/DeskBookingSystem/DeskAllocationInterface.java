package design.system.DeskBookingSystem;

public interface DeskAllocationInterface {
    public boolean isAllocated();

    public boolean allocate(Employee employee);

    public String getName();

    public String getRow();

    public String getColumn();

}
