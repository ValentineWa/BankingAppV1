package bankaccountapp;

public abstract class Account implements IBaseRate{
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;
    static int index = 10000;

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
                "\nBalance: " + balance);
    }
    //List common methods


}
