//Check Whether Number is Palindrome on not
import java.util.Scanner;

public class palindrome1 {
    public static void main(String[] args) {
        int n, x = 0;
        System.out.println("Enter a number=");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int temp = n;
        while (n > 0) {
            x = (x * 10) + (n % 10);
            n = n / 10;

        }
        if (x == temp)
            System.out.println(temp + "  Palindrome Number");
        else
            System.out.println(temp + " Not Palindrome Number");
    }

}
