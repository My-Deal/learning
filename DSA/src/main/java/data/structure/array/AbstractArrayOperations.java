package data.structure.array;

public class AbstractArrayOperations {

    public static void print(int [] array){
        int i=0;
        while (i<array.length){
            System.out.print(array[i]+"\t");
            i++;
        }
    }

    /**
     *
     * @param array
     * @param n
     * @param start
     * @param end
     * @return
     */
    public static int[] reverseArray(int [] array, int n,int start,int end){
        if(start>end && (start<0 || end>=array.length)){
            throw new RuntimeException("Invalid Start and End !!!!!!!!!!!!!!!!!!!");
        }
        int min=start,max=end;
        int temp=0;
        while(min<max){
            temp=array[min];
            array[min]=array[max];
            array[max]=temp;
            min++;
            max--;
        }
        return array;
    }
}
