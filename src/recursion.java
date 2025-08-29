// 10. using recursion display fibonacci series
import java.util.scanner*;
public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO FINDING FIBONACCI SERIES");
        System.out.print("ENTER THE NUMBERS OF ELEMENT TO BE PRINTED :");
        int count = input.nextInt();
        for(int i = 1; i <= count; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int position){
        if (position == 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }
        return fibonacci(position-1) + fibonacci(position-2);
    }
    }

// 11. . using recursion to display if string is a palindrome or not 
import java.util.scanner*;
public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO FINDING PALINDROME ");
        System.out.print("ENTER THE STRING YOU WANT TO CHECKED  :");
        String  str  = input.next();
         System.out.print("YOUR STRING IS " +((isPalindrome(str) ? "Palindrome" : " Not Palindrome")));
    }
    public static boolean isPalindrome(string  str) {
        if (str.length() <= 1 ) {
            return true;
        }
        int lastPos = str.length - 1;
        if (str.charAt(0) != str.charAt(lastPos) ) {
            return false;
        }
        String newStr = str.substring(1,lastPos);
        retrun isPalindrome(newStr);
    }
}
