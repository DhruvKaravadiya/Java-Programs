import java.util.Scanner;
/*Write a complete multi-threaded program to meet following requirements:
a. Read matrix [A] m x n
b. Create m number of threads
c. Each thread computes summation of elements of one row, i.e. ith row of the 
matrix is processed by ith thread. Where 0 <= i< m.
d. Print the results.*/
class compute extends Thread{
    int x; 
    int n ; 
    int sum;
    compute(int x,int n){
        this.x = x;
        this.n = n;
    }
    @Override
    public void run(){
       try{
           sum = sum + x;
        int i = 1;
        if(i<n){
            System.out.println(Thread.currentThread().getName()+"---- Sum of "+n+"th row  =  "+sum);
            sum=0;
            i++;
        } 
       } 
       catch(Exception ie){
        ie.printStackTrace();
       }
       
    }
}

public class p3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter m=");
        int m = sc1.nextInt();
        System.out.println("Enter n=");
        int n = sc1.nextInt();
        int a[][] = new int[m][n];

        //Read Array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Array element a[%d][%d] - ", i,j);
                 a[i][j] = sc1.nextInt();
            }
            System.out.println();
        }

        //Print Array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(a[i][j]+" ");
            }
            System.out.println();
        }
        

        compute var; 
        int  passValue=0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                passValue = a[i][j];
                var = new compute(passValue, j);
                var.start();
            }
        }
        
    }
}