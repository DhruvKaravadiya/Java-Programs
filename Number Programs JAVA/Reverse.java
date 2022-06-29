//Reverse a number using loop(while or for)
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n, flag=0;
        System.out.print("Enter a number="); 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int rem=0;
        while (n != 0) {
            flag=n%10;
            rem=(rem*10) + flag;
            n=n/10; 
        }
        System.out.println(""+rem);
    }
}



