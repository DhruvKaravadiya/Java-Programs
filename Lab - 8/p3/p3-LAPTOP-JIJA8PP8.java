import java.util.Scanner;
/*WAP to create Account class, which is representing a bank account where we can 
deposit and withdraw money. if we want to withdraw money which exceed our bank 
balance? We will not be allowed, create InSufficientFundException to handle above 
situation and display proper error message*/
class InSufficientFundException extends Exception{
    void checkWithdraw(long w,long bal){
        try{
            if(w>bal){
                throw new InsufficientResourcesException();
            }
        }
        catch(InSufficientFundException ife){
            ife.printStackTrace();
            System.out.println("Withdraw amount is more than Account balance");
        }
    }
}
public class Account{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Current Balance");
        int actBalance = sc1.nextInt();
        System.out.println("Enter withdraw amount = ");
        long withdrawaAmount = sc1.nextLong();
        checkWithdraw(withdrawaAmount,actBalance);
        }       
           
    }
