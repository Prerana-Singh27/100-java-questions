//while loop - multiplication table;

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("WELCOME TO MULTIPLICATION TABLE ");
        System.out.print("Enter your number : ");
        num = input.nextInt();
        int  i=1;
        while(i <= 10) {
            System.out.println(num + "X" + i + "=" +num * i);
            i++;
        }
        System.out.println();
    }
}*/

//by function - multiplication table

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO MULTIPLICATION TABLE");
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        printMultiplicationTable(num);
    }
    public static void printMultiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "X" + i + "=" + num * i);
            i++;
        }
    }
}*/

//sum of all odd numbers given by user

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO odd number sum ");
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        printOddnumSum(num);
    }

    public static void printOddnumSum(int num) {
        int i = 1,sum = 0;
        while (i <= num) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("odd number sum from 1 to" + num +  " is: " + sum);
    }
}*/

//factorial

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO FACTORIAL TABLE");
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        factorialTable(num);
    }
    public static void factorialTable(int num) {
        int i = 1, fact = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println(  "factorial of " + num + " is : " +fact);
    }
}*/

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO FACTORIAL TABLE");
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        long fact = factorialTable(num);
        System.out.println("fatorial of " + num + " is :" + fact);
    }
    public static long factorialTable(int num){
           if(num < 2){
               return 1;
           }
           long fact = 1;
           int i = 2;
           while(i <= num){
               fact *= i;
               i++;
           }
           return fact;
        }
    }*/

//sum of digits of integers

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO INTEGER DIGITS SUM");
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        long sum = integersSum(num);
        System.out.println("sum of integers digit of  " + num + " is :" + sum);
    }
    public static long integersSum(int num){
        long sum = 0;
        while( num > 0){
            sum += num % 10;
            num = num/10;
        }
        return sum;
    }
}*/

//finding LCM

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO LEAST COMMON MULTIPLE");
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = input.nextInt();
        int lcm = findLcm(num1,num2);
        System.out.println("LCM  of two numbers is :" +lcm);
    }

        public static int findLcm(int num1, int num2 ){
            int i = 1;
            while(true){
                int factor = num1 * i;
                if(factor % num2 == 0 ){
                    return factor;
                }
                i++;
            }
    }
}*/

//GCD OF 2 NUMBERS

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO GREATEST COMMON DIVISOR");
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = input.nextInt();
        int gcd = findGCD(num1,num2);
        System.out.println("GCD  of two numbers is :" +gcd);
    }

    public static int findGCD(int num1, int num2 ){
        int gcd = 1;
        int i = 2;
        int least = least(num1,num2);
        while( i <= least ){
            if( num1 % i== 0 &&  num2  %  i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int num1 , int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
}*/

//CHECK PRIME NUMBER

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CHECKING PRIME NUMBER ");
        System.out.print("Enter your  number : ");
        int num = input.nextInt();
        boolean isprime = findPrimeNum(num);
        if (isprime){
            System.out.println(num + " is a prime number ");
        }else{
            System.out.println(num+ " is NOT a prime number " );
        }

    }
        public static boolean findPrimeNum(int num){
        int i = 2;
        while(i < num){
        if(num % i == 0 ){
            return false;
        }
        i++;
        }
        return true;
        }
    }*/

//reverse of digits

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CHECKING REVERSE NUMBER ");
        System.out.print("Enter your  number : ");
        int num = input.nextInt();
        int revNum = findReverse(num);
        System.out.println( " the reverse number of this no is " +num + " is :" +revNum);
    }


        public static int findReverse(int num){
        int revNum = 0;
        while(num > 0){
            int digit  =  num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        return revNum;
        }
    }*/

//fibonacci series

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO FIBONACCI SERIES");
        System.out.print("Enter your  number : ");
        int num = input.nextInt();
        System.out.println(" the fibonacci series is : ");
        printFibonacci(num);
    }

    public static void  printFibonacci(int num) {
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0)return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}*/

//AEMSTRONG NUMBER

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO ARMSTRONG NUMBER SERIES");
        System.out.print("Enter your  number : ");
        int num = input.nextInt();
         boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("THE GIVEN NUMBER IS AN ARMSTRONG");
        }else{
            System.out.println("THE GIVEN NUMBER IS NOT AN ARMSTRONG");
        }
    }
    public static boolean  isArmstrong(int num) {
         int numberOfDigits = numberOfDigits(num);
         int numCopy = num;
         int finalNumber = 0;
        while(num > 0 ) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit , numberOfDigits);
        }

        return finalNumber == numCopy;
    }
    public static int pow(int num1 , int num2){
               int result = 1;
               int i = 0;
               while(i < num2){
                   result *= num1;
                   i++;
               }
               return result;
    }
        public static int numberOfDigits(int num){
             int digit = 0;
             while( num > 0){
                 digit++;
                 num /= 10;
             }
             return digit;
        }
    }*/

//PALINDROME number

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO PALINDROME NUMBER SERIES");
        System.out.print("Enter your  number : ");
        int num = input.nextInt();
        isPalindrome(num);
    }
    public static boolean isPalindrome(int num) {
        int revNum = findRevNum(num);
        int currNum = num;
        if (currNum == revNum) {
            System.out.println("NUMBER IS PALINDROME ");
        } else {
            System.out.println("NUMBER IS NOT PALINDROME ");
        }
        return true;
    }
    public static int findRevNum(int num){
    int revNum = 0;
    while(num > 0){
        int digit = num % 10;
         revNum = revNum * 10 + digit;
        num /= 10;
    }
    return revNum;
    }
}*/

//PRINT PATTERN

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your  rows : ");
        int rows = input.nextInt();
        printFirstPattern(rows);
    }

    public static void printFirstPattern(int maxRows) {
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}*/

/*import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your  rows : ");
        int rows = input.nextInt();
        printSecondPattern(rows);
    }

    public static void printSecondPattern(int maxRows) {
        int rows = maxRows;
        while (rows > 0) {
            int i = 0 ;
            while (i < rows ) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}*/

import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your  rows : ");
        int n = input.nextInt();
        printFirstPattern(n);
        printSecondPattern(n);
        printThirdPattern(n);
    }
    public static void printFirstPattern(int n) {
        int rows = 0;
        while (rows < n) {
            int j = 0;
            while (j <= rows) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            rows++;
        }
    }
    public static void printSecondPattern(int n) {
        System.out.println("HERE IS THE SECOND PATTERN :");
        int rows = 0;
        while (rows < n) {
            int j = 0;
            while (j < n - rows) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            rows++;
        }
    }
    public static void printThirdPattern(int n) {
        System.out.println("HERE IS THE THIRD PATTERN :");
        int rows = 0;
        while (rows < n) {
            //for spaces
            int spaces = n - rows - 1;
            int j = 0;
            while (j < spaces) {
                System.out.print("  ");
                j++;
            }
            //for star printing
            int i = 0;
            while(i <= rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}