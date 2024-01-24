package bankaccountapp;

public abstract class Account implements IBaseRate{
    private String name;
    private String sSN;
    private double balance;
    protected String accountNumber;
    protected double rate;
    protected static int index = 10000;

    // List common properties for Svings and Checkings account

    //Constructor to set base properties and initialise the account.
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        System.out.println("New Account: ");
        System.out.println("Name: "+ name);
        System.out.println("sSN: "+ sSN);
        System.out.println("BALANCE: "+ initDeposit);

        index++;
        this.accountNumber = setAccountNumber();
        setRate();

}
    // Set account number
    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() *Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }
    public void showInfo() {
        System.out.println("Name: " + name +
                "\nAccount nUMBER: "+ this.accountNumber +
                "\nBalance: " + balance +
                "\nRate: " + rate + "%");
    }
    //List common methods

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing Ksh" + amount );
        printBalance();
    }
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing Ksh" + amount );
        printBalance();
    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transfering Ksh" + amount + " to " + toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now Ksh" + balance);

    }
    //Abstract means we don't have to create from the abstract class and the Typse savings /Checking mjust implement this inherited abstract method
    public abstract void setRate();
    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance +accruedInterest;
        System.out.println("Accrued Interest: Ksh " + accruedInterest);
        printBalance();
    }

}
