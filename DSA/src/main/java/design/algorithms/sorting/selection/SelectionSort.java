package design.algorithms.sorting.selection;

import design.algorithms.sorting.ArrayPrint;
import design.algorithms.sorting.Sorting;

public class SelectionSort implements ArrayPrint , Sorting {



    public static void main(String[] args) {
        int [] array={4,1,3,2,6,5,7,8,9};
        SelectionSort selectionSort=new SelectionSort();
        selectionSort.arraySort(array);
        selectionSort.print(array);
    }

    @Override
    public void print(int[] array) {
        ArrayPrint.super.print(array);
    }

    @Override
    public void arraySort(int[] array) {
        int temp;
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
