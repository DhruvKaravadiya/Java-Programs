import java.util.Scanner;
public class lab_4_p3 {
    public static void main(String[] args) {
        System.out.println("Enter array elements =");
        Scanner sc1 = new Scanner(System.in);
        int [] x = new int[4];
        for(int i = 0 ; i < 4 ; i++){
            x[i] = sc1.nextInt();                 
        }
        System.out.format("Array = {%d ,%d ,%d ,%d}",x[3],x[2],x[1],x[0]);
    }
}
