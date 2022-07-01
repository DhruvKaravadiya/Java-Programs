public class practise_methods {
    static void multiplication(int n){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.format("%d X %d = %d \n",n, i, n*i);
        }
    }
    static int sum(int n){
        if(n==1)
            return 1;
        else
        return n + sum(n-1);    
    }
    static int fibbo(int n){
        if(n==0)
            return 0;
        else if (n==1)
            return 1;
        else 
            return fibbo(n-1) + fibbo(n-2);
    }
    public static void main(String[] args) {
       //multiplication(8);
       
       //Recursion Sum(Upto n natural numbers)
       int x = sum(10);
       System.out.println(x);

       //Fibbonaci using recursoin
      // System.out.println(fibbo(6));
      }
}
