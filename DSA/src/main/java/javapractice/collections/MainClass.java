package javapractice.collections;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        Set<Employee> set=new HashSet<>();
set.add(new Employee(1L,"emp1",12));
set.add(new Employee(2L,"emp2",13));

set.add(new Employee(1L,"emp1",12));
        System.out.println(set.size());
        System.out.println(set);


    }
}
