/*Define Time class with constructor to initialize hour and minute. Also define addition 
method to add two time objects.*/
import java.util.Scanner;

public class Time1 {
    int hour;
    int minute;
    int second;

    public Time1(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public static Time1 diff(Time1 t2, Time1 t1) {
        Time1 diffTime = new Time1(0, 0, 0);
        diffTime.hour = t1.hour - t2.hour;
        if(diffTime.hour<0){
            diffTime.hour = (-diffTime.hour);
        }
        diffTime.minute = t1.minute - t2.minute;
        if(diffTime.minute<0){
            diffTime.minute = (-diffTime.minute);
        }
        diffTime.second = t1.second - t2.second;
        if(diffTime.second<0){
            diffTime.second = (-diffTime.second);
        }
        return diffTime;
    }

    public static void main(String[] args) {
        Time1 t1 = new Time1(1, 2, 3);
        Time1 t2 = new Time1(11, 4, 6);
        Time1 printTime;

        printTime = diff(t1, t2);
        System.out.println(printTime.hour + " " + printTime.minute + " " + printTime.second);
    }
}
