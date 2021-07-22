package data.structure.array;

public class MatrixRotateIthRowIthTimes {
    public static void main(String[] args) {

    MatrixRotateIthRowIthTimes matrix=new MatrixRotateIthRowIthTimes();
    int [][] array={{1,2,3},{4,5,6},{7,8,9}};
   array= matrix.rotateIthRowIthTime(array);
    for (int i=0;i<array.length;i++){
        AbstractArrayOperations.print(array[i]);
    }
    }

    public int[][] rotateIthRowIthTime(int[][] array2D) {
        for (int i = 1; i < array2D.length; i++) {
            array2D[i] = AbstractArrayOperations.reverseArray(array2D[i], array2D[i].length, 0, array2D[i].length - 1);
            array2D[i] = AbstractArrayOperations.reverseArray(array2D[i], array2D[i].length, 0, i);
            array2D[i] = AbstractArrayOperations.reverseArray(array2D[i], array2D[i].length, i + 1, array2D[i].length);
        }
        return array2D;
    }

}
