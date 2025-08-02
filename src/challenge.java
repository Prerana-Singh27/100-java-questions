//ADD 2 NUMBERS

/*import java.util.Scanner;
public class challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Num1 :");
        int Num1 = input.nextInt();
        System.out.print("Enter your Num2 :");
        int Num2 = input.nextInt();
        int sum=Num1 + Num2;
        System.out.print("add 2 numbers :" +sum );
    }
}*/


/*import java.util.Scanner;
public class challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your a :");
        int a = input.nextInt();
        System.out.print("Enter your b:");
        int b = input.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is :" +a);
        System.out.println("value of b is :" +b);
    }
}*/

/*import java.util.Scanner;
public class challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your NUM1 :");
        int NUM1 = input.nextInt();
        System.out.print("Enter your NUM2:");
        int NUM2 = input.nextInt();
        System.out.println(NUM1 + NUM2);
        System.out.println(NUM1 - NUM2);
        System.out.println(NUM1 * NUM2);
        System.out.println(NUM1 / NUM2);
        System.out.println(NUM1 % NUM2);
    }
}*/

/*import java.util.Scanner;
public class challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("product of two floating points numbers:");
        System.out.print("Enter your NUM1 :");
        float NUM1 = input.nextFloat();
        System.out.print("Enter your NUM2:");
        float NUM2 = input.nextFloat();
        System.out.println(NUM1 * NUM2);
    }
}*/

/*import java.util.Scanner;
public class challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("perimeter of a rectangle:");
        System.out.print("Enter your a :");
        int a = input.nextInt();
        System.out.print("Enter your b:");
        int b = input.nextInt();
        System.out.print("Enter your c:");
        int c = input.nextInt();
        System.out.print("Enter your d:");
        int d = input.nextInt();
        int perimeter=a+b+c+d;
        System.out.println("The perimeter of rectangle is :" +perimeter);
    }
}*/

/*import java.util.Scanner;
public class challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of triangle:");
        System.out.print("Enter your breadth & height :");
        int b = input.nextInt();
        int h = input.nextInt();
        int area = ( b * h)/2;
        System.out.println("Area of triangle is : " + area);
    }
}*/


import java.util.Scanner;
public class challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULATE SIMPLE INTEREST or COMPOUND INTEREST :");
        System.out.print("Enter your Principle amount rs :");
        int principle = input.nextInt();
        System.out.print("Enter your rate of interest :");
        float rate = input.nextFloat();
        System.out.print("Enter your time :");
        float time = input.nextFloat();

        float si = (principle * rate * time) / 100;
        double ci = principle*(1+rate/100)*time;
        System.out.println("our simple interest is : " + si);
        System.out.println("our compound interest is : " + ci);
    }
}


