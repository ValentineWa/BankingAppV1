package bankaccountapp;

public class BanKAccountApp {
    public static void main(String[] args) {

        Checking chekacc1 = new Checking("Tom Ford", "37082590", 1500);
        Savings savacc1 = new Savings("Richie Spice", "37082220", 2000);

        chekacc1.showInfo();
        savacc1.showInfo();
        // Read a CSV file the create new accounts based on that data.
//        System.out.println("Hello world!");
    }

}