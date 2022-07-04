/*. Write a program that creates and initializes a four integer element array. Calculate and 
display the average of its values*/
import java.util.Scanner;
public class lab_4_p2 {
    public static void main(String[] args) {
        System.out.println("Enter array elements =");
        Scanner sc1 = new Scanner(System.in);
        double sum = 0;
        int [] x = new int[4];
        for(int i = 0 ; i < 4 ; i++){
            x[i] = sc1.nextInt(); 
            sum+=x[i];       
        }
        System.out.println("Average = "+sum/4);

    }
}
