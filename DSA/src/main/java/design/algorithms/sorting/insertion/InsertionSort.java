package design.algorithms.sorting.insertion;

import design.algorithms.sorting.ArrayPrint;
import design.algorithms.sorting.Sorting;

public class InsertionSort implements ArrayPrint , Sorting {
    public void arraySort(int[] array){
        int length=array.length;
        int temp;
        for(int i=1;i<length;i++){
        temp=array[i];
        int j=i-1;
        while (j>=0 && array[j]>temp){
            array[j+1]=array[j];
            j--;
        }
        array[j+1]=temp;
        }

    }

    private void swapRight(int startIndex,int endIndex,int[] array){
        int temp;
        for (int i=endIndex;i>=startIndex;i--){
            array[i+1]=array[i];
        }
    }

    public static void main(String[] args) {
        int []array={3,2,4,6,5,1,7};
        InsertionSort insertionSort=new InsertionSort();
        insertionSort.arraySort(array);
        insertionSort.print(array);
    }
}
