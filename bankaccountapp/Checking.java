package bankaccountapp;

    public class Checking extends Account{
        private int debitCardNumber;
        private int debitCardPin;
    // List the properties specific to a checking account

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

//    System.out.println("Account nUMBER: " + this.accountNumber);
//    System.out.println("New Checking account");
}
    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPin = (int)(Math.random() * Math.pow(10, 4));
}
    public void showInfo(){
        super.showInfo();
        System.out.println("Account Type: Checking");
        System.out.println("Your Checkings Account features: " +
                        "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card Pin: " + debitCardPin);
    }

    // List any methods specific to the checking account
@Override
    public void setRate(){
        rate = getBaseRate() * .15;
        System.out.println("Implement rate for Checkings");
    }
}
