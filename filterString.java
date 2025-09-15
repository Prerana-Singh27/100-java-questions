//convert an array of string into stream


package functionalProgramming;

import java.util.List;

import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        List<String> names = List.of("APPLE", "BANANA", "GRAPES");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}

