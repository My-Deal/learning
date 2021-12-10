package javapractice.array;

public class ArrayTest {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        System.out.println(array.getClass().getName());
      print(array);
        change(array);
      print(array);
    }

    public static void change(int [] array){
        for (int i=0;i<array.length;i++){
            array[i]=++array[i];
        }
    }

    public static void print(int [] array){
        for (int temp: array){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
}
