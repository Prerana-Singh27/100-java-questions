
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
