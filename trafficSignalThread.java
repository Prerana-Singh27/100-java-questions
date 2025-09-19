//create three thread signals-red,green,yellow

package thread;

public enum TraffiColor {
    RED (9000),
    YELLOW(10000) ,
    GREEN(3000);

    private final int time;

    TraffiColor(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}

