
// PRIME OR NOT ==> USE FUNCTION
import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int N = sc.nextInt();
        if (prime(N) == 1)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }

    public static int prime(int n) {
        int flag = 0;
        if (n == 1 || n == 0)
            return 0;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag++;
                }
            }
            if (flag)
                return 1;
            else
                return 0;
        }

    }
}
