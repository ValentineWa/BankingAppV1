package bankaccountapp;

public interface IBaseRate {
    //All properties will be used in the application
    default  double getBaseRate(){
        return 2.5;
    }
    // Its gotten from somewhere else hence why we didn't write this code in Savings or Checkings

    //Write a method that returns a base rate

}
