package javapractice.oops;

public class DataTypesAndOperators {
    public static void main(String[] args) {
        boolean b1=true;
        boolean b2=false;
        boolean b3=true;
        if(b1 & b2 | b2 & b3 | b2){
            System.out.println("OK");
        }
        if(b1 & b2 | b2 & b3 | b2 | b3){
            System.out.println("DOKAY");
        }
        boolean b4,b5,b6;
        b1=b2=b3=b4=true;

       int a=10;
       a=a++ +a + a-- -a-- + ++a;
        System.out.println(a);
        a=10;
        a=a-- +a + a++ -a++ + --a;
        System.out.println(a);
    }
}
