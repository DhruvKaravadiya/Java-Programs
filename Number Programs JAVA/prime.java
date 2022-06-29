// PRIME OR NOT ==> WITHOUT FUNCTION 

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n, i, flag = 0;
        System.out.print("Enter the number=");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a Prime Numnber");
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a Prime Number");
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is Prime number ");
            }

        }
    }
}