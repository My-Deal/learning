package design.algorithms.sorting.bubble;

import design.algorithms.sorting.ArrayPrint;
import design.algorithms.sorting.Sorting;

public class BubbleSort implements ArrayPrint, Sorting {

    public void arraySort(int[] array) {
        int temp;
        boolean swap=false;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Debug: i="+i);
            for (int j = 0; j < array.length - i-1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
    }

    public static void main(String[] args) {
    BubbleSort bubbleSort=new BubbleSort();
    int [] array={1,2,3,4,5,6,7,8,9};
    bubbleSort.arraySort(array);
    bubbleSort.print(array);
    }
}
