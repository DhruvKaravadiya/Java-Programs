//Fibbonaci Series Using RECURSION
import java.util.Scanner;
public class fibboR{
    public static void main(String[] args) {
        System.out.print("Enter a number=");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        System.out.println("0"+" "+"1"); //Base Case for which recurion stops 
        fibbo(n-2);
    }
    public static int fibbo(int n){
        if(n>0){
            static int n1=0,n2=0,n3=0;
            n3=(n1+n2);
            System.out.println(n1+" "+n2);
            n1=n2;
            n2=n3;
        }
    }
}