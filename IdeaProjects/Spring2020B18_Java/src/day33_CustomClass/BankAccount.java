package day33_CustomClass;

public class BankAccount {
  /*
    practice task:
    create a custom class for bank account
      attrubutes: accountholder, accountnumber, balance
      actions: cehckingBalance(), withDraw( amount ), deposit( amount )
     */

    String accountHolder;
    long accountNumber;
    double balance;

                // how would customer be able to check balance
                 // we create method
    public void checkingBalance(){
        System.out.println("Available Balnce: "+balance);
    }

    public void withDraw(double amount){
                 // as soon as this is being called :
        System.out.println("Withdrawing $"+amount);
                // after withdrawing, balance will be decreased:
        balance -= amount;
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance += amount;
    }


    public String toString(){
        String result = "Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nAvilable Balance: "+balance;
        return result;
    }



}


