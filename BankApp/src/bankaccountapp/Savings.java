package bankaccountapp;

public class Savings extends Account{
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    // List the properties specific to a Savings account

    // Constructor to initialize Savings account properties
        public Savings(String name,String sSN, double initDeposit){
            super(name, sSN, initDeposit);
            accountNumber = "1" + accountNumber;
//            System.out.println("Account nUMBER: "+ this.accountNumber);
//             System.out.println("New Savings account");

}
    // List any methods specific to the Savings account
}
