/*Write an interactive program to print a string entered in a pyramid form. For instance, 
the string "stream" has to be displayed as follows:
                     s
                    s t
                   s t r
                  s t r e
                 s t r e a
                s t r e a m      */
import java.util.Scanner;
public class lab_4_p6{
    public static void main(String[] args) {
        System.out.println("Enter the string = ");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();

        for(int i = 0 ; i < str.length(); i++ ){
            for(int k = str.length()-i ; k>0;k--){
                System.out.print(" ");
            }
           
            for(int j = 0 ; j<i+1;j++ ){
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}