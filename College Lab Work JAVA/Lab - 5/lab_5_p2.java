/*Define Time class with constructor to initialize hour and minute. Also define addition 
method to add two time objects.*/
import java.util.Scanner;
class Time {
    int hour;
    int minute;
    int second;

    public Time(int h,int m,int s){ 
        this.hour = h;
        this.minute = m ;
        this.second = s;
    }
    public void sum(Time t){
      this.second += t.second;
      if(this.second>=60){
        this.second++;
        this.second-=60;
      }
      this.minute += t.minute;
      if(this.minute>=60){
        this.minute++;
        this.minute-=60;
      } 
      this.hour += t.hour; 
    }
}
public class lab_5_p2{
  public static void main(String[] args) {
    Time t1 = new Time(0,0,0);
    Time t2 = new Time(3,67,56);
    t1.sum(t2);
    System.out.println(t1.hour+"hrs :"+t1.minute+"min :"+t1.second+"sec");
  }
}
