package thread;

 class threeThread extends Thread {
     private Object threadNumber;

     @Override
    public void run() {
        System.out.printf("%s Thread Starting-%d\n",
                Thread.currentThread().getName(),threadNumber);
        
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

        System.out.printf("%s Thread Ending-%d\n",
                Thread.currentThread().getName(),threadNumber);
    }

    public static void main(String[] args) throws InterruptedException {
        threeThread t1 = new threeThread();
        threeThread t2 = new threeThread();
        threeThread t3 = new threeThread();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
     }
}

