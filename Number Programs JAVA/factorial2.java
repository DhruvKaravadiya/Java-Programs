// Factorial of a number USING RECURSION
import java.util.Scanner;
public class factorial2 {
    public static int fact(int n){
        if(n==1||n==0)
            return 1 ;
        else
            return (n * fact(n-1));
    }
    public static void main(String[] args) {
        int x;
        System.out.print("Enter a number=");
        Scanner sc1 = new Scanner(System.in);
        x = sc1.nextInt();        
        System.out.println("Factorial="+fact(x)); 
        sc1.close();
    }
}
