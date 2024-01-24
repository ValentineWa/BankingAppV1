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
            setSafetyDepositBox();
}
    private void setSafetyDepositBox(){
         safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
         safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
}

    public void showInfo(){
        super.showInfo();
        System.out.println("Your Savings Account features: " +
                            "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                            "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
    }
    // List any methods specific to the Savings account
    public  void setRate(){
        rate = getBaseRate() - .25;
        System.out.println("Implement rate for Savings");
    }

}
