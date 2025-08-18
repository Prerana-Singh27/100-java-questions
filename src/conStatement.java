//challenge - 1 - create prog to find minimum of two numbers;

 /*import java.util.Scanner;
public class conStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number a : ");
        int a = input.nextInt();
        System.out.print("Enter your number b : ");
        int b = input.nextInt();
        int minNum = a < b ? a : b;
        System.out.println("this is the minimum number : " +minNum);
    }
}*/

//Q2---find number is even or odd

/*import java.util.Scanner;
public class conStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number  : ");
        int num = input.nextInt();
        String checkNum = (num % 2 == 0) ? "even" : "odd" ;
        System.out.println("the given number is " + checkNum);
    }
}*/

//Q3---find absolute value of an integers

/*import java.util.Scanner;
public class conStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your integers  : ");
        int num = input.nextInt();
        int absoluteValue = (num < 0) ? -num : num ;
        System.out.println("the given integer absolute value is : " + absoluteValue);
    }
}*/

//Q4---create students score---ternary operator;

/*import java.util.Scanner;
public class conStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score  : ");
        int score = input.nextInt();
        String result = (score > 80) ? "High" : (score < 50 ? "Low" : "Moderate") ;
        System.out.println("the student score is  : " + result);
    }
}
 */

//Q5---find absolute value of an integers

/*import java.util.Scanner;
public class conStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your month number (1-12) : ");
        int monthNum = input.nextInt();
        String month = switch(monthNum) {
            case 1  -> ("January");
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
        System.out.println("the  month is  : " + month);
    }
}*/

//Q6---simple calculator ---switch statement

import java.util.Scanner;
public class conStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("WELCOME TO MINI CALCULATOR  ");
        System.out.println("enter your num1 : ");
        int num1 = input.nextInt();
        System.out.println("enter your num2 : ");
        int num2 = input.nextInt();
        System.out.println("enter your operator(+,-,*,/) : ");
        String operator = input.next();
        int result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
        System.out.println("your ans is : " +result);
    }
}
