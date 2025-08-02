//2D ARRAY - FINDING SUM AND AVERAGE OF ELEMENTS
import java.util.Scanner;
public class Array2Dques2 {
    public static void main(String[] args) {
        System.out.println("Welcome to find 2DArray Sum and Average Elements \n");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        System.out.println("your sum is : " +sum);
        double avg = avg(numArr);
        System.out.println("your avg is : " +avg);
    }
    public static long sum(int[][] numArr){
        long sum = 0;
        int i =0;
        while(i < numArr.length){
            int j = 0;
            while(j < numArr[i].length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double avg(int[][] numArr){
        if(numArr.length == 0){
            return 0;
        }
        int rows = numArr.length;
        int columns = numArr[0].length;
        double size = rows * columns;
        return sum(numArr)/size;
    }
}
