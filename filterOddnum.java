//

package functionalProgramming;


import java.util.List;

public class filterOddnum {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2,4,7,9,3,87,37,57);
        nums.stream()
                .filter( number -> number % 2 != 0)
                .forEach(number -> System.out.println(number));
    }
}

