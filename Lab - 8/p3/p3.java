import java.util.Scanner;

/*WAP to create Account class, which is representing a bank account where we can 
deposit and withdraw money. if we want to withdraw money which exceed our bank 
balance? We will not be allowed, create InSufficientFundException to handle above 
situation and display proper error message*/
class InSufficientFundException extends Exception{
}
public class Account{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Current Balance");
        int actBalance = sc1.nextInt();
        System.out.println("Withdraw or Deposit W / D");
        char choice = sc1.next();
        if(choice == W){
            System.out.println("Enter withdraw amount = ");
            long withdrawaAmount = sc1.nextLong();
        }
        else if (choice == D){
            System.out.println("Enter deposit amount = ");
            long depositAmount = sc1.nextLong();
        }
    }
}