public class Watch {
    private int hour;
    private int minute;
    private int second;

    public Watch(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Watch(int hour, int minute) {

        this(hour,minute,0);

    }
    public Watch(int hour) {
        this(hour,0,0);

    }
    public Watch() {
        this(0,0,0);
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }
}
