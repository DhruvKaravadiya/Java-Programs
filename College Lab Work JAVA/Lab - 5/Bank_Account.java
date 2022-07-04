/*Create a class named Bank_Account with data memebers accountNo, userName, 
email, accountType and accountBalance, Also create methods getAccountDetails() 
and displayAccountDetails()*/
class Bank_Account {
    long accountNo;
    String userName;
    String email;
    String accountType;
    double accountBalance;

    Bank_Account(long accountNo, String userName, String email, String accountType, double accountBalance) {
        super(accountNo,userName,email,accountType,accountBalance);
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void getAccountDetails(){
        
    }

    public void displayAccountDetails() {
        System.out.println(accountType + " - " + accountNo + " - " + accountType + " - " + email);
    }

}
