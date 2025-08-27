//password checker(do-while)

import java .util.scanner*;
public class loops{
public static void main (String[] args){
Scanner input = new scanner(System.in);
        String corrPassword = "shruti123";
        String i;
        do{
            System.out.println("Enter password : ");
            i = input.nextLine();
        } while (!i.equals( corrPassword ));
        System.out.println("Access granted!!!!");
}
}

// 2. // number guessing game

import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO NUMBER GUESSING GAME ");
        int num = 5, guess;
        do {
            System.out.println("Enter number between 0-10 : ");
            guess = input.nextInt();
        } while (num != guess);
        System.out.println("Access granted!!!!");
    }
}

 //3. for loop to finding multiplication table

import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO MULTIPLICATION TABLE ");
        System.out.print("Enter your num :");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mul = num * i;
            System.out.println( + num + "*" +i+ " = " + mul);
        }
    }
}


//4. for loop to finding prime or not

import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CHECKING IF NUM IS PRIME OR NOT ");
        System.out.print("Enter your num :");
        int num = input.nextInt();
        boolean isPrime = findPrimeNum(num);
        if (isPrime) {
            System.out.println(num + " is a prime number ");
        } else {
            System.out.println(num + " is NOT a prime number ");
        }

    }
    public static boolean findPrimeNum(int num) {
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
            return true;

    }


        public class loops {
    public static void main(String[] args) {
        System.out.println("WELCOME TO FINDING THE MAX ");
        int[] arr = ArrayUtility.inputArray();
