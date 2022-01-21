package javapractice.streamapi;
// Final and effective final in lambda
public class Lambda2 {
    public static void main(String[] args) {
        String name="virendra";
       // name=name.concat(" mishra");
        new Thread(()-> System.out.println(name));
    }
}
