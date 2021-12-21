package interviews.blackrock;

public class FinallyExecution {
    public static void main(String[] args) {
        try{
            FinallyExecution.divide(100, 0);
        }
        finally{
            System.out.println("finally in main");
        }
    }
    public static void divide(int n, int div){
        try{
            int ans = n/div;
        }
        finally{
            System.out.println("finally of divide");
        }
    }
}
