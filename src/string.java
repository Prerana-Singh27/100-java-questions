// define student class with fields like name and age and use toString to print student details 

public class string{
  String name;
  int age;
//constructor
public string(String name , int age ){
  this.name = name;
  this.age = age;
}

public String toString() {
  return "Student Details : {name : " + name + ", age : " + age + "}";
}
  public static void main (String[] args){
    string student = new string("shruti" , 20);
    system.out.println(student);
  }
}
    
//concatenate and convert : take 2 string and also covert uppercase

public class string{
    public static void main(String[] args){
        String firstName = "shruti";
        String lastName = "singh";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }
}

//calculate area and circumference of a circle for given radius
public class string {
    public static void main(String[] args) {
        double radius = 20;
        double circumFerence = 2 * Math.PI * radius ;
        System.out.println("your circle circumFerence is " +circumFerence);
    }
}

// another method

import java.util.Scanner;
class string {
    double radius;
    //constructor
    string(double radius) {
        this.radius = radius;
    }
    double circumference() {
        return 2 * radius * Math.PI;
    }
    public String toString(){
        return "Circle props : " + radius +" , circumference: " + circumference() ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your radius : ");
        double radius = input.nextDouble();
        string circle = new string(radius);
        System.out.println(circle);
    }
}

//stimulate a dice roll using math.random() and display outcome(1-6)

class string {
    int roll() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }
    public static void main(String[] args) {
        string dice = new string();
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }
    }
}
