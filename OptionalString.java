//write function--accept string,return Optional<string>--string empty/null-return emptyOptional--return optional containing the uppercase version of the string...


package functionalInterface;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(toOptional(null));
        System.out.println(toOptional(""));
        System.out.println(toOptional("shruti"));

    }

    public static Optional<String> toOptional(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());

    }
}

