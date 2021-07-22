package data.structure.array;

public class LargestSumInArray {
    public static void main(String[] args) {
   // int [] array={7,1,5,3,6,4};
        int []array={-2};
        System.out.println(largestConSumInArray(array));
    }

    public static int largestConSumInArray(int [] array){
        int sum=0;
        int sumTillNow=-Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            sum=sum+array[i];

            if(sumTillNow<sum){
                sumTillNow=sum;
            }
            if(sum<0){
                sum=0;
            }

        }
        return sumTillNow;
    }

    public static void maxProfit(int [] array){
        int minPrice=Integer.MAX_VALUE;
        int minIndex=0;
        int maxIndex=0;
        int maxPrice=0;
        for(int i=0;i<array.length;i++){
            if(minPrice>array[i]){
                minPrice=array[i];
                minIndex=i;
            }
        }

        for (int j=minIndex;j<array.length;j++){
            if(maxPrice<array[j]){
                maxPrice=array[j];
                maxIndex=j;
            }
        }
        System.out.println(" Max Price:"+(maxPrice-minPrice));

    }


}
