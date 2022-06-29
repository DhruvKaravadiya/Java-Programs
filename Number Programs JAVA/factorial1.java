//Factorial of a number
import java.util.Scanner;
public class factorial1{
    public static void main(String[] args) {
        int fact=1,n;
        System.out.print("Enter a number=");
        Scanner sc1 = new Scanner(System.in);
        n  = sc1.nextInt();
        sc1.close();
        for(int i = 1; i<=n ; i++){
             fact *= i;
        }
        System.out.println("Factorail is=" + fact);
    }
}