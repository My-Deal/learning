package test;

/**
 * Input : arr1[] = {1, 2, 4, 5, 7}
 * arr2[] = {5, 6, 3, 4, 8}
 * x = 9
 * Output : 1 8
 * 4 5
 * 5 4
 */
public class TestClass {
    public static void sumPair(int arr1[],int []arr2, int x){
        int num;
        int diff;
        for (int i=0;i<arr1.length;i++){
            num=arr1[i];
            diff=x-num;
            if(findDiff(arr2,diff)){
                System.out.println(num+" "+diff);
            }

        }
    }
    private static  boolean findDiff(int arr[], int diff){
        for (int i=0;i<arr.length;i++){
            if (diff==arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 7};
        int arr2[] = {5, 6, 3, 4, 8};
        int x=9;
        sumPair(arr1,arr2,x);
    }

}
