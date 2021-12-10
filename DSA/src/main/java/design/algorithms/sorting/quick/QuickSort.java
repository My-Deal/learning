package design.algorithms.sorting.quick;

import design.algorithms.sorting.ArrayPrint;
import design.algorithms.sorting.Sorting;

public class QuickSort implements ArrayPrint, Sorting {
    @Override
    public void print(int[] array) {
        ArrayPrint.super.print(array);
    }

    @Override
    public void arraySort(int[] array) {
        quickSort(array,0,array.length-1);
    }

    public void quickSort(int [] array,int low,int high){
        if(low<high){
            int pivot=partition(array,low,high);

            quickSort(array,low,pivot-1);

            quickSort(array,pivot,high);
        }
    }

    private int partition(int [] array, int low, int high){
        int pivot= array[high];
        int i=low-1;
        for (int j=low;j<=high;j++){
            if(array[j]<pivot){
                i++;
                swap(array,i,j);
            }
        }
        swap(array,i+1,high);
        return (i+1);
    }

    private void swap(int [] array, int i , int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void main(String[] args) {
        int [] array1={10,80,30,90,40,50,70};
        int []array2={90,60,100,50,20,30,10,40,70,80,15,45,25,35};
        QuickSort quickSort=new QuickSort();
        quickSort.arraySort(array1);
        quickSort.print(array1);
        quickSort.arraySort(array2);
        quickSort.print(array2);
    }
}
