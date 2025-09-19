package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedthreadPool  implements Runnable{

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Started with thread: %s\n " , current.getName());
        try {
            Thread.sleep(getRandom() * 1000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Ended with thread: %s \n " , current.getName());
    }
        private int getRandom() {
        double random = Math.random() * 5 + 1;
        return (int) random;
    }
    public static void main(String[] args)  {
       try (ExecutorService executor = Executors.newFixedThreadPool(3)) {
        for (int i = 0; i < 10; i++) {
            FixedthreadPool task = new FixedthreadPool();
            executor.submit(task);
        }
           //executor.shutdownNow();

        if (!executor.awaitTermination(15, TimeUnit.SECONDS)){
            System.out.println("EMERGENCY SHUTDOWN");
            executor.shutdownNow();
        }
       } catch  (InterruptedException e) {
           throw new RuntimeException(e);
       }
}
}

