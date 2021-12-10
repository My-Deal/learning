package design.algorithms.sorting.merge;

import design.algorithms.sorting.ArrayPrint;
import design.algorithms.sorting.Sorting;

public class MergeSort implements ArrayPrint, Sorting {

    @Override
    public void print(int[] array) {
        ArrayPrint.super.print(array);
    }

    @Override
    public void arraySort(int[] array) {
        divide(array,0,array.length-1);
    }

    void divide(int[] array,int left, int right){
        if(left<right) {
            int middle = middle(left, right);
            divide(array, left, middle);
            divide(array, middle + 1, right);
            merge(array, left, right, middle);
        }
    }

    void merge(int[] array,int left, int right , int middle){
        int leftLength=middle-left+1;
        int rightLength=right-middle;
        int [] leftArray=new int[leftLength];
        int [] rightArray=new int[rightLength];
        for (int i=left,j=0;i<=middle;i++){
            leftArray[j]=array[i];
            j++;
        }
        for (int i=middle+1,j=0;i<=right;i++){
            rightArray[j]=array[i];
            j++;
        }
        int i=0,j=0;int k=left;
        while(k<=right && ( i< leftLength  && j< rightLength)){
            if(leftArray[i]<rightArray[j]){
                array[k]=leftArray[i];
                i++;
            }else{
                array[k]=rightArray[j];
                j++;
            }
            k++;
        }
        if(i<leftLength){
            while(i<leftLength){
                array[k++]=leftArray[i++];
            }
        }
        if(j<rightLength){
            while (j<rightLength){
                array[k++]=rightArray[j++];
            }
        }
    }

    private int middle(int left,int right){
        return (left+(right-1))/2;
    }

    public static void main(String[] args) {
        int [] array={9,1,5,2,7,2,8,4,3,12,90,54,67};
        MergeSort mergeSort=new MergeSort();
        mergeSort.print(array);
        mergeSort.arraySort(array);
        mergeSort.print(array);
    }
}
