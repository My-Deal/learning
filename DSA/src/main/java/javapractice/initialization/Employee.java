package javapractice.initialization;

public class Employee {


        private int id;

    public Employee(int id){
        this.id=id;

        System.out.print(id);
    }
        static{
            System.out.println("In static");
        }

        {
            id=10;

            System.out.println(id);
        }


    public static void main(String[] args) {
    Employee employee=new Employee(20);
    }

}
