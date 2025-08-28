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
        
 //4.  for - each loop --find maximum element in an array

        public class loops {
    public static void main(String[] args) {
        System.out.println("WELCOME TO FINDING THE MAX ");
        int[] arr = ArrayUtility.inputArray();

             int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("Maximum number is " + max);
    }
}

// 5. for - each --- finding num of occurrences in an element of array
        import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        System.out.println("WELCOME TO FINDING THE OCCURRENCES OF ELEMENT  ");
        int[] numArray = ArrayUtility.inputArray();
             System.out.println("ENTER THE NUM YOU WANT TO FIND ");
            int num = input.nextInt();
            int occ = noOfOcc(numArray , num);
            System.out.println("your no was found  " +occ + " times");
    }
         public static int noOfOcc(int[] numArray , int num){
                 int occ = 0;
                 for(int nums : numArray){
                         if(nums == num){
                                 occ++;
                         }
                 }
                 return occ;
         }

//7. using break read inputs from user

import java.util.Scanner;
public class loops{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while (true) {
            System.out.println("Enter your Command : ");
            String command = input.next();
            if (command.equals("exit")) {
                break;
            }
        }
        System.out.println("you have successfully exited ");
    }
}

        
