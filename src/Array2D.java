import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find 2DArray Searching\n");
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.print("enter the number you want to search :");
        int num = input.nextInt();
        boolean isFound = isFound(numArr,num);
        if(isFound){
            System.out.println("your number was found in the array");
        }else{
            System.out.println("your number was not found in the array");
        }
    }
    public static boolean isFound(int[][] numArr,int num){
        int i = 0;
        while(i < numArr.length){
            int j =0;
            while (j < numArr.length) {
                if(numArr[j][i] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;

    }
}
