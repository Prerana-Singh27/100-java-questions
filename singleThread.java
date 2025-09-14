package thread;

public class signalThread extends Thread{
    private final TraffiColor color;

    public signalThread(TraffiColor color) {
        this.color = color;
    }

    public void run() {
            System.out.printf("%s active\n " , color);
            try {
                Thread.sleep(color.getTime());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.printf("%s inactive\n" , color);
        }

    public static void main(String[] args) throws InterruptedException {
        signalThread red = new signalThread(TraffiColor.RED);
        signalThread yellow = new signalThread(TraffiColor.YELLOW);
        signalThread green = new signalThread(TraffiColor.GREEN);

        red.start();
        green.join();
        yellow.start();
        yellow.join();
        green.start();
    }
    }


