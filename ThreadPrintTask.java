package thread;

public class prinTask extends Thread {

    private final int threadNum;

    public prinTask(int threadNum) {
        this.threadNum = threadNum;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) Hello from thread - %d \n ", (i + 1), threadNum);
        }
    }

    public static void main(String[] args) {
        prinTask t1 = new prinTask(1);
        prinTask t2 = new prinTask(2);

        t1.start();
        t2.start();
    }
}
