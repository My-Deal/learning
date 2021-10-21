package javapractice;

interface A{
    default void print(){
        System.out.println("print A");
    }
}

interface B{
    default void print(){
        System.out.println("print B");
    }
}

class Implementation implements A,B{


    @Override
    public void print() {
        B.super.print();
    }
}
public class DDDProblemWithDefault {
    public static void main(String[] args) {
        Implementation impl=new Implementation();
        impl.print();
    }
}
