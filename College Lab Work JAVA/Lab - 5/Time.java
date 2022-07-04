
import java.util.Scanner;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public static Time sum(Time t2, Time t1) {
        Time addTime = new Time(0, 0, 0);
        addTime.hour = t1.hour + t2.hour;
        addTime.minute = t1.minute + t2.minute;
        addTime.second = t1.second + t2.second;
        return addTime;
    }

    public static void main(String[] args) {
        Time t1 = new Time(1, 2, 3);
        Time t2 = new Time(1, 2, 3);
        Time printTime;

        printTime = sum(t1, t2);
        System.out.println(printTime.hour + " " + printTime.minute + " " + printTime.second);
    }
}
