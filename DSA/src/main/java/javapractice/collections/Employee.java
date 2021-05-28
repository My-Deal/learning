package javapractice.collections;

import java.util.Objects;

public class Employee {
    private Long id;
    private String name;
    private int rank;

    public Employee() {

    }

    public Employee(Long id, String name, int rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int hashCode() {
       return 13;
    }
}
