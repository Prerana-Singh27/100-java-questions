//list of strings,use stream operations to filter out Strings that have length of 10 or more and then concate the remaining Strings

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

