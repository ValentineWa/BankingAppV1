package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BanKAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();


//Instead of doing the part below, we will read csv files to get the information
       /* Checking chekacc1 = new Checking("Tom Ford", "37082590", 1500);
        Savings savacc1 = new Savings("Richie Spice", "37082220", 2000);

        chekacc1.showInfo();
        System.out.println("****************");
        savacc1.showInfo();

        savacc1.deposit(5000);
        savacc1.withdraw(500);
        savacc1.transfer("Brokerage", 1000);
        savacc1.compound(); */

//        chekacc1.deposit();
        // Read a CSV file the create new accounts based on that data.
        String file = "/Users/valentine.waweru/Downloads/NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders){
//            System.out.println("NEW ACCOUNT");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if(accountType.equals("Checkings")){
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else {
                System.out.println("Error Reading Account Type");
            }
//            System.out.println(accountHolder[0]);
//            System.out.println(accountHolder[1]);
//            System.out.println(accountHolder[2]);
//            System.out.println(accountHolder[3]);
        }
//        accounts.get(5).showInfo();
        for(Account acc : accounts){
            System.out.println("\n*******************");
            acc.showInfo();
        }
    }
            //Access an element in data structure

}