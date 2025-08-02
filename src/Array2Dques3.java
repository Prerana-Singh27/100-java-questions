import java.util.Scanner;
public class Array2Dques3 {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D Array Diagonal Sum \n");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonal(numArr);
        System.out.println("your diagonal sum is : " + sum);
    }
    public static long sumOfDiagonal(int[][] numArr){
        long leftSum = sumOfLeftDiagonal(numArr);
        long rightSum = sumOfRightDiagonal(numArr);
        long sum = leftSum + rightSum;
        if(numArr.length % 2 != 0){
            int ind = numArr.length/2;
            sum -= numArr[ind][ind];
        }
       return sum;
    }
    public static long sumOfLeftDiagonal(int[][] numArr){
        long sum = 0;
        int i = 0;
        while(i < numArr.length){
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }
    public static long sumOfRightDiagonal(int[][] numArr){
        long sum = 0;
        int i = 0;
        while(i < numArr.length) {
            int col = numArr.length - 1 - i;
            sum += numArr[i][col];
            i++;
        }
        return sum;
    }
}
