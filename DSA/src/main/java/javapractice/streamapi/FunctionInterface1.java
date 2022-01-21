package javapractice.streamapi;

public class FunctionInterface1 {
    public static void main(String[] args) {
       ThreadLocal<Integer> threadLocal=ThreadLocal.withInitial(()->1);
       ThreadLocal<Long> longThreadLocal=ThreadLocal.withInitial(()->2L);
        System.out.println("hello");
    }
}
