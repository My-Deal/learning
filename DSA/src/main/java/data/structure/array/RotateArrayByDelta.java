package data.structure.array;

import java.util.Scanner;

/**
 *
 */
public class RotateArrayByDelta extends AbstractArrayOperations{

    public static void main(String[] args) {
        RotateArrayByDelta rotateArrayByDelta=new RotateArrayByDelta();
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter count on integers !");
        int n=scanner.nextInt();
        int[] array=new int[n];
        while (n>0){
            array[array.length-(n)]=scanner.nextInt();
            n--;
        }
        System.out.println("Array you entered is:");
        rotateArrayByDelta.print(array);
        System.out.println("How many places do you want to rotate array ?");
        int d=scanner.nextInt();
        System.out.println("Rotated array is :");
        rotateArrayByDelta.print(rotateArrayByDelta.rotateArray(array,array.length,d));

    }

    /**
     *
     * @param arr
     * @param n
     * @param d
     * @return
     */
    public int[] rotateArray(int [] arr,int n, int d){
        int [] array=reverseArray(arr,n,0,d-1);
        array=reverseArray(array,n,d,n-1);
        array=reverseArray(array,n,0,n-1);
        return array;
    }



}
