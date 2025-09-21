//write lambda expression --takes 2 integers --return multiplication----


package functionalProgramming;

import java.util.function.BinaryOperator;

public class lambdaExpression {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = ( a,  b) -> a * b;
       int result = multiply.apply(5, 6);
        System.out.println("Multiplication is : " +result);
    }
}
