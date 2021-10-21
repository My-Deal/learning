package javapractice.accessmodifier;

public class StaticTest {
    public static String name="xyz";
    public static int i=0;

    public static void main(String[] args) {
       /* StaticTest test=null;
        test.name="";
        int number=012;
        System.out.println(number);*/
        StaticTest st=new StaticTest();
        System.out.println(++st.i);
     int a=10;
     int b=20;
     int c=40;



    }

    public static void execute(){
        System.out.println("execute");
    }

}
