
/*WAP to create Account class, which is representing a bank account where we can 
deposit and withdraw money. if we want to withdraw money which exceed our bank 
balance? We will not be allowed, create InSufficientFundException to handle above 
situation and display proper error message*/
import java.util.Scanner;

class InSufficientFundException extends Exception {
    private long giveWithdraw;

    InSufficientFundException(long n) {
        this.giveWithdraw = n;
    }

    public String toString() {
        return "InSufficientFundException(" + giveWithdraw + ")";
    }
}

public class Account {
    public static void main(String[] args) {
        long accountBalance = 10000;
        System.out.println("Enter withdraw amount");
        Scanner sc1 = new Scanner(System.in);
        long withdrawAmount = sc1.nextLong();
        try {
            if ((accountBalance = accountBalance - withdrawAmount) < 0) {
                throw new InSufficientFundException(accountBalance);
            } else {
                System.out.println("Not enought money in account");
            }
        } catch (InSufficientFundException e) {
            System.out.println("Entered money is more than the acc balance");
        }

    }

}