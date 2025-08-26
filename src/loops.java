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
