package javapractice.oops;

public class Overloading {

    public static void main(String[] args) {
        C c=new C();
        printMessage(c);
    }

    public static void printMessage(A a){
        System.out.println(" In A");
    }

    public static void printMessage(B b){
        System.out.println("in B");
    }

    public static void printMessage(Object obj){
        System.out.println("in Object");
    }


}

 class A{

}

class B extends A{

}

 class C extends B{

 }


