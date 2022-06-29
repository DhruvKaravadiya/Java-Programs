import java.util.Scanner;
// Print fibbonaci series without recursion

public class fibbonaci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, n;
        System.out.print("Upto how many terms you want to print fibbonaaci series=");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Series is ");
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < n; i++){ 
            n3 = n1 + n2;
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
        }           
    }
}