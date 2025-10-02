//creates single-thread-----prints 1 to 10

package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singleThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\nTHE NUMBER FROM 1-10 IS : %d ", i);
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runnable task = new singleThread();

        executor.submit(task);
        executor.shutdown();
    }
}


