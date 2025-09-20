//write 2 versions--calculates--factorial of number--using structural programming--

package functionalInterface;

import java.util.Scanner;
import java.util.stream.IntStream;

public class twoVersions {
    public static void main(String[] args ) {
        System.out.print("enter your number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("factorial of " + num + "is:" + fact);

        IntStream.rangeClosed(2, num) .reduce((a, b) -> a * b)
        .ifPresent(System.out::println);
    }
    }


