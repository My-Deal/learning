package interviews.blackrock;

public class StockPrice {
    public static void main(String[] args) {
        int [] case1={100 , 80 , 60 , 70 , 60 , 70 , 85};
        int [] case2={80,90,60,30,85,25,50};
        System.out.println("Brut Force");
        System.out.println(maxProfitBruteForce(case1));
        System.out.println(maxProfitBruteForce(case2));

        System.out.println("Optimum");
        System.out.println(maxProfitOptimum(case1));
        System.out.println(maxProfitOptimum(case2));
    }

    public static int maxProfitBruteForce(int [] array){
        int max=0;
        int buyAt=-1;
        int sellAt=-1;

        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[j]-array[i]>max){
                    max=array[j]-array[i];
                    buyAt=i;
                    sellAt=j;
                }
            }
        }
        System.out.println("Buy at :"+array[buyAt]+" and Sell at:"+array[sellAt]+" with max Profit:"+max);
        return max;
    }

    public static int maxProfitOptimum(int [] array){
        int max=0;
        int buyAt=0;
        int sellAt=0;
        for (int i=0;i<array.length;){
            if(array[i]>array[sellAt]){
                sellAt=i;
            }
            if(array[i]<array[buyAt]){
                buyAt=i;
                if (sellAt<buyAt){
                    sellAt=buyAt;
                }
            }
            if(array[sellAt]-array[buyAt]>max){
                max=array[sellAt]-array[buyAt];
            }
            i++;
        }
        System.out.println("Buy at :"+array[buyAt]+" and set at:"+array[sellAt]+" with max Profit:"+max);
        return max;
    }

}
