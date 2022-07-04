import java.util.Scanner;
public class lab_4_p7{
    public static void main(String[] args) {
        System.out.println("Enter a number = ");
        Scanner sc1 = new Scanner(System.in);
        int N = sc1.nextInt();
        for(int i = 0 ; i < N; i++ ){
            for(int k = N-i-1 ; k>0;k--){
                System.out.print(" ");
            }
           
            for(int j = 0 ; j<i+1;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0 ; i < N-1 ; i++ ){
            
            for(int x = 0;x<i+1;x++){
                System.out.print(" ");
            }
            for(int k = N-i-1; k>0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}