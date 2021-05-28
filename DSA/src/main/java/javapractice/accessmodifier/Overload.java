package javapractice.accessmodifier;

public class Overload {
    public static void main(String[] args) {
    new Overload().print(10.0f);
    }

    public int print(float number){
        System.out.println("hello in int");
        return 0;
    }

    public void print(double number){
        System.out.println("hello in long");
    }
}
