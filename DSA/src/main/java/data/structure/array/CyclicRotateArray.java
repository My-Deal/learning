package data.structure.array;

import java.util.Scanner;

public class CyclicRotateArray extends AbstractArrayOperations{

    public static void main(String[] args) {

        CyclicRotateArray cyclicRotateArray =new CyclicRotateArray();
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter count on integers !");
        int n=scanner.nextInt();
        int[] array=new int[n];
        while (n>0){
            array[array.length-(n)]=scanner.nextInt();
            n--;
        }
        System.out.println("Array you entered is:");
        cyclicRotateArray.print(array);
        System.out.println("How many places do you want to rotate array ?");
        int d=scanner.nextInt();
        System.out.println("Rotated array is :");
        //cyclicRotateArray.print(rotateArrayByDelta.rotateArray(array,array.length,d));
    }
}
