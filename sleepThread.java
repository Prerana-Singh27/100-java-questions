package thread;

public class sleepThread extends Thread {

    @Override
    public void run() {
        try{
        Thread.sleep(4000);
            System.out.printf("From inside run %s " , getState());
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException{
        sleepThread t1 = new sleepThread();
        System.out.printf("CREATE THE THREAD %s\n " , t1.getState());
        t1.start();
        t1.join();
        System.out.printf("thread finished %s\n" , t1.getState());
    }
}
