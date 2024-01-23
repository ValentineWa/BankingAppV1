package bankaccountapp;

public class Checking extends Account{
    private int debitCardNumber;
    private int debitCardPin;
    // List the properties specific to a checking account

    // Constructor to initialize checking account properties
public Checking(String name, String sSN, double initDeposit){
    super(name, sSN, initDeposit);
    accountNumber = "2" + accountNumber;
//    System.out.println("Account nUMBER: " + this.accountNumber);
//    System.out.println("New Checking account");
}
    // List any methods specific to the checking account

}
