package functionalProgramming;

import java.util.List;

public class filterString {
    public static void main(String[] args) {
        List<String> strs = List.of("SHOBHASINGH" , "PRERANA" , "SHRUTISINGH");

      String result =   strs.stream().filter(name -> name.length() > 10)
                .reduce( "", (a , b) -> a + " " + b);
        System.out.println(result);
    }
}
