package data;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.second = second;
        this.hour = hour;
        this.minute = minute;
    }

    //getter

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getHour() {
        return hour;
    }

    //setter

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d : %02d : %02d", hour, minute, second);
    }
    // next second
    public Time nextSecond() {
        second++;
        if (second == 60) {
            minute++;
            second = 0;
        }
        if (minute == 60) {
            hour = hour + 1;
            minute = 0;
        }
        if (hour == 24) {
            hour = 0;
        }
        return this;
    }
    //previous second
    public Time previousSecond() {
        second--;
        if (second == -1) {
            minute--;
            second = 59;
        }
        if (minute == -1) {
            hour = hour - 1;
            minute = 59;
        }
        return this;
    }

}
