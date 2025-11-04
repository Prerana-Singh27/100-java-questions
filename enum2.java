// create enum represent days of week , prints out all days of the week

package seeEnum;

public enum Day {
    Sunday(false),
    Monday(true),
    Tuesday(true),
    Wednesday(true),
    Thursday(true),
    Friday(true),
    Saturday(false),

    private final boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "weekday" : "weekend";
    }
}



