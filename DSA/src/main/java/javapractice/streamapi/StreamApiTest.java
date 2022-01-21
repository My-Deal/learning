package javapractice.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiTest {


    public static void main(String[] args) {
        List<Employee> employeeList=List.of(new Employee(1,"Virendra Shinde",4.0,new Address("Street no1 ville parle","Lane 3","Mumbai","Mumbai","maharashtra","India",321321)),
                new Employee(2,"Mohit",12,new Address("123","2","Gurgaon","Gurgaon","Haryana","India",122003)),
                new Employee(3,"Neha",20,new Address("3243","34","Pune","Pune","Maharashtra","India",232244)),
                new Employee(4,"Neeti",34,new Address("123","12","Patiala","Patiala","Punjab","India",32424)),
                new Employee(5,"Parminder",12,new Address("G-123","02","Chandigarh","Chandigarh","Punjab","India",001234)),
        new Employee(6,"Virendra Mishra",50,new Address("01","01","Sultanpur","Sultanpur","Uttar Pradesh","India",228125)));

        List<List<Employee>> listOfStateEmployees =List.of(employeeList.stream().filter(employee -> employee.address.state.equalsIgnoreCase("Punjab")).collect(Collectors.toList()),
                employeeList.stream().filter(employee -> employee.address.state.equalsIgnoreCase("Uttar Pradesh")).collect(Collectors.toList()),
                employeeList.stream().filter(employee -> employee.address.state.equalsIgnoreCase("Maharashtra")).collect(Collectors.toList()),
                employeeList.stream().filter(employee -> employee.address.state.equalsIgnoreCase("haryana")).collect(Collectors.toList()));

        List<Address> addressList=employeeList.stream().map(employee -> employee.address).collect(Collectors.toList());
        //addressList.stream().forEach(System.out::println);

        //listOfStateEmployees.stream().flatMap(employees -> employees.stream()).collect(Collectors.toList()).stream().forEach(System.out::println);

        List<Employee> sortedListBasedOnMarks=employeeList.stream().sorted(Comparator.comparing(employee -> employee.marks)).collect(Collectors.toList());
        //sortedListBasedOnMarks.stream().forEach(System.out::println);

        System.out.println(employeeList.stream().min((employee,marks)-> (int) employee.marks).get());
    }
}

class Employee{
    int id;
    String name;
    double marks;
    Address address;
    Employee(int id,String name,double marks,Address address){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", address=" + address +
                '}';
    }
}

class Address{
    String street;
    String laneNo;
    String district;
    String city;
    String state;
    String country;
    int postalCode;

    public Address(String street, String laneNo, String district, String city,String state, String country, int postalCode) {
        this.street = street;
        this.laneNo = laneNo;
        this.district = district;
        this.city = city;
        this.state=state;
        this.country = country;
        this.postalCode = postalCode;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", laneNo='" + laneNo + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
