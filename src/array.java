/*import java.util.Scanner;

//Q1.FIND THE SUM AND AVERAGE OF ALL ELEMENTS IN AN ARRAY

public class array {
    public static void main(String[] args) {
        System.out.println("Welcome to array sum and average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = avg(numArray);
        System.out.println("SUM OF THE NUMBER IS : " +sum);
        System.out.println("AVERAGE OF THE NUMBER IS : " +avg);
    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum += i;
            i++;
        }
        return sum;
    }
    public static int avg(int[] numArray){
        long sum = sum(numArray);
        return (int)(sum/ numArray.length);
    }
}*/

//Q2.FIND NUMBER OF OCCURRENCE OF ELEMENT IN AN ARRAY

/*import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find number of occurrence :");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("enter the number you want to find :");
        int num = input.nextInt();
        int occ = noOfOccurrences(numArray, num);
        System.out.println("your element was found " + occ + " times in the array");
    }


    public static int noOfOccurrences(int[] numArray, int num) {
        int i = 0;
        int occ = 0;
        while (i < numArray.length) {
            if (numArray[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}

//Q3.FIND THE MAXIMUM AND MINIMUM ELEMENT IN AN ARRAY

/*import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        System.out.println("Welcome to finding maxima and minima  :");
        int[] numArray = ArrayUtility.inputArray();
        int max = findMaximum(numArray);
        System.out.println("THE MAXIMUM ELEMENT OF NUMBER IS : " +max);
        int min = findMinimum(numArray);
        System.out.println("THE Minimum ELEMENT OF NUMBER IS : " +min);
    }
    public static int findMaximum(int[] numArray){
        if(numArray.length == 0){
            return Integer.MIN_VALUE;
        }
           int maxElement = numArray[0];
           int i = 1;
           while(i < numArray.length ){
               if(numArray[i] > maxElement){
                   maxElement = numArray[i];
               }
               i++;
           }
           return maxElement;
    }
    public static int findMinimum(int[] numArray){
        if(numArray.length == 0){
            return Integer.MAX_VALUE;
        }
        int minElement = numArray[0];
        int i = 1;
        while(i < numArray.length ){
            if(numArray[i] < minElement){
                minElement = numArray[i];
            }
            i++;
        }
        return minElement;
    }
}*/



//Q4.SORTED ARRAY
/*
 import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        System.out.println("Welcome to checking sorted array element  ");
        int[] numArray = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArray);
        boolean isDec = isDecreasing(numArray);
        if (isInc || isDec) {
            System.out.println("THE GIVEN ARRAY IS SORTED");
        } else {
            System.out.println("THE GIVEN ARRAY IS NOT SORTED ");
        }
    }
    public static boolean isIncreasing(int[] numArray) {
        int i = 1;
        while (i < numArray.length ) {
            if (numArray[i] < numArray[i - 1]) {
                return false;// not in increasing order
            }
            i++;
        }
        return true;// increasing order
    }
    public static boolean isDecreasing(int[] numArray) {
        int i = 1;
        while (i < numArray.length ) {
            if (numArray[i] > numArray[i - 1]) {
                return false;//not in decreasing  order
            }
            i++;
        }
        return true;// decreasing order
    }
}*/

//Q5. RETURN A NEW ARRAY DELETING A SPECIFIC ELEMENT

/*import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find Array Deletion\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("enter the number you want to delete :");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr,numToDelete);
        System.out.println("Here is your new array\n");
         ArrayUtility.displayArray(newArr);
    }
    public static int[] deleteNumber(int[] numArr ,int numToDelete) {
        int occ = noOfOccurrences(numArr, numToDelete);
        if (occ == 0) {
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];
        int i = 0, j = 0;
        while(i < numArr.length){
            if(numArr[i] != numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
    public static int noOfOccurrences(int[] numArray, int num) {
        int i = 0;
        int occ = 0;
        while (i < numArray.length) {
            if (numArray[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}*/

//Q6 Reverse An Array

/*import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse an Array \n");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println(" HERE IS YOUR REVERSE ARRAY ");
        ArrayUtility.displayArray(numArr);
    }
    public static void reverse(int[] numArr){
        int i = 0;
        while (i < numArr.length/2) {
            int temp = numArr[i];
            numArr[i] = numArr[(numArr.length - 1 )- i];
            numArr[numArr.length - 1 - i] = temp;
            i++;
        }
    }
}*/

//Q7 GIVEN ARRAY IS PALINDROME OR NOT

/*import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        System.out.println("Welcome to check array is palindrome or not \n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalindrome = isPalindrome(numArr);
        if(isPalindrome){
            System.out.println("GIVEN ARRAY ELEMENT IS PALINDROME");
        }else {
            System.out.println("GIVEN ARRAY ELEMENT IS NOT PALINDROME");
        }
    }
    public static boolean isPalindrome(int[] numArr){
        int left = 0;
        int right = numArr.length - 1;
        while(left < right){
            if(numArr[left] != numArr[right] ){
                return false;//not palindrome
            }
            left++;
            right--;
        }
        return true;//palindrome
    }
}*/

//Q8.MERGE TWO SORTED ARRAY

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArr = merge(arr1, arr2);
        System.out.println("YOUR MERGED ARRAY IS : ");
        ArrayUtility.displayArray(mergedArr);
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i];
                i++;
                k++;
            } else {
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}