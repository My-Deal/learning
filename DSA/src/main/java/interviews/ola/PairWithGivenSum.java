package interviews.ola;

import java.util.Arrays;

public class PairWithGivenSum {

    public static void main(String[] args) {
        int array[] ={6,1,2,3,9,4,0,12,54,87,90,-12};
        Arrays.stream(new PairWithGivenSum().printPairWithGivenSumOptimum(array,0)).sequential().forEach(System.out::println);

    }
    public void printPairWithGivenSumBruteForce(int [] array,int targetSum){

    }

    public int []  printPairWithGivenSumOptimum(int [] array,int targetSum){
        Arrays.sort(array);
        int [] pair=new int[2];
        int start=0;
        int end=array.length-1;
        for (;;){
            if(array[start]+array[end]==targetSum){
                pair[0]=array[start];
                pair[1]=array[end];
                return pair;
            }
            else if(array[start]+array[end]<targetSum){
                start++;
            }
            else
                if(array[start]+array[end]>targetSum){
                    end--;
                }
        }
    }
    private int getPivot(int [] array,int start,int end){
        if(end-start%2==0){
            return (end-start)/2;
        }else{
            return ((end-start)/2)+1;
        }
    }
}
