package design.algorithms.sorting;

public interface ArrayPrint {
    default void print(int [] array){
        for (int num:array){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
