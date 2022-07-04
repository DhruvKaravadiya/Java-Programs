import java.util.Scanner;
public class lab_4_p4 {
    public static void main(String[] args) {
        System.out.print("Enter string = ");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        System.out.println("Length = "+str.length());
        System.out.println("Half string = "+str.substring(0, str.length()/2));
    }
}
