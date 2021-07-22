package data.structure.array;

public class LongestContiguousSum {
    public static void main(String[] args) {
        int[] array = {-1,2,6,-9,3,1,4,7,-2,10,-15,6};
    longestContiguousSum(array);
    }

    public static void longestContiguousSum(int[] array) {
        int n = array.length;
        int start = 0, end = 0;
        int maxCurrent = 0;
        int maxSoFar = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxCurrent = maxCurrent + array[i];
            if (maxSoFar <= maxCurrent) {
                maxSoFar = maxCurrent;

                end = i;
            }
            if (maxCurrent < 0) {
                maxCurrent = 0;
                start = i+1;
            }
        }
        System.out.println("start=" + start + " end=" + end);
        System.out.println("Max=" + maxSoFar);
    }
}
