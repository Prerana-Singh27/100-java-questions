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
