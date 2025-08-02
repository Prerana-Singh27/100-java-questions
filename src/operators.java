/*import java.util.Scanner;
 public class operators {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Determine the numbers :");
   System.out.println("Enter your number :");
   int num= input.nextInt();
   if(num > 0){
    System.out.println("my number is positive !!!!");
   } else if (num < 0) {
    System.out.println("my number is negative !!!");
   }else {
    System.out.println("my number is zero");
   }
  }
}*/

/*import java.util.Scanner;
public class operators {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Determine the numbers is even or odd :");
  System.out.println("Enter your number :");
  int num = input.nextInt();
  if (num % 2 == 0) {
   System.out.println("my number is even!!!!");
  } else {
   System.out.println("my number is odd !!!");
  }
 }
}*/


/*import java.util.Scanner;
public class operators {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Determine the greatest of three numbers :");
  System.out.println("Enter your numbers :");
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  int num3 = input.nextInt();
  if (num1 >= num2 && num1 >= num3) {
   System.out.println("the greatest no is: " +num1);
  } else if( num2 >= num3) {
   System.out.println("the greatest no is: " +num2);
  } else {
   System.out.println("the greatest no is: " +num3);
  }
 }
}*/


/*import java.util.Scanner;
public class operators {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Determine the year :");
  System.out.println("Enter your year :");
  int num = input.nextInt();
  if (num % 4 == 0 && num % 400 == 0  || num % 100 != 0) {
   System.out.println("the given year is leap year: ");
  } //else if (num % 100 != 0) {
//   System.out.println("the year is  leap year");
//  }
   else {
   System.out.println("the year is not a leap year");
  }
 }
}*/


/*import java.util.Scanner;
public class operators {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("welcome to result grade checking :");
  System.out.println("Enter your percent  :");
  float num = input.nextFloat();

  if(num >= 90 ){
   System.out.println(num + "the grade is A ");
  } else if (num >= 75) {
   System.out.println(num + "the grade is B ");
  }else if (num >= 60  ) {
   System.out.println(num + "the grade is C ");
  }else if (num >= 30  ) {
   System.out.println(num + "the grade is D ");
  }else {
   System.out.println(num + "the grade is F ");
  }
 }
}*/



/*import java.util.Scanner;
public class operators {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("welcome to categorize a person :");
  System.out.println("Enter your age here  :");
  int age = input.nextInt();

  if (age <= 13) {
   System.out.println("the person is child ");
  } else if (age <= 20) {
   System.out.println("the person is teen ");
  } else if (age <= 60) {
   System.out.println("the person is adult ");
  } else {
   System.out.println("the person is senior ");
  }
 }
}*/

//AND OPERATOR

/*import java.util.Scanner;
public class operators {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("welcome to bitwise operator!!!!");
  System.out.print("Enter your first number  :");
  int first = input.nextInt();
  System.out.print("Enter your second number  :");
  int second = input.nextInt();

  int result = first & second;
  System.out.println("RESULT IS " + result);
 }
}*/

//OR OPERATOR

/*import java.util.Scanner;
public class operators {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("welcome to bitwise operator!!!!");
  System.out.print("Enter your first number  :");
  int first = input.nextInt();
  System.out.print("Enter your second number  :");
  int second = input.nextInt();

  int result = first | second;
  System.out.println("RESULT IS " + result);
 }
}*/

//XOR OPERATOR
/*import java.util.Scanner;
public class operators {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("welcome to bitwise operator!!!!");
  System.out.print("Enter your first number  :");
  int first = input.nextInt();
  System.out.print("Enter your second number  :");
  int second = input.nextInt();

  int result = first ^ second;
  System.out.println("RESULT IS " + result);
 }
}*/

//NOT OPERATOR
/*import java.util.Scanner;
public class operators {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("welcome to bitwise operator!!!!");
  System.out.print("Enter your num  :");
  int num = input.nextInt();


  int result = ~num;
  System.out.println("RESULT IS " + result);
 }
}*/

//LEFT SHIFT OPERATOR

/*import java.util.Scanner;
public class operators {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("welcome to bitwise operator!!!!");
  System.out.print("Enter your  num  :");
  int num= input.nextInt();


  int result = num << 4;
  System.out.println("RESULT IS " + result);
 }
}*/


//RIGHT SHIFT OPERATOR
/*import java.util.Scanner;
public class operators {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("welcome to bitwise operator!!!!");
  System.out.print("Enter your  number  :");
  int num = input.nextInt();


  int result = num >> 2;
  System.out.println("RESULT IS " + result);
 }
}*/

//even odd by bitwise operator


import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to bitwise operator!!!!");
        System.out.print("Enter your  number  :");
        int num = input.nextInt();

        if ((num & 1) == 0) {
            System.out.println("RESULT IS even ");
        } else {
            System.out.println("RESULT IS odd ");
        }
    }
}