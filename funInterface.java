//single abstract method--that accepts an integer and return a boolean--implement using lambda --cracks if the no is prime.


package functionalInterface;

public class funInterface {
    public static void main(String[] args) {
        Candidate candidate = num -> {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(candidate.isCandidate(2));
    }
    public interface Candidate {
        boolean isCandidate(int num);
    }
}

