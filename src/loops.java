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


