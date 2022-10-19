package SimpleBankAccount;

import java.text.NumberFormat;
/**
 * An extension Parent Bank Account class 
 * 
 * @class Savings Account
 * @author Mcandrew Okwei
 * @version 2.0 (09-18-2022)
 * An extension Parent Bank Account class
 */
public class SavingsAccount extends SimpleBankAccount {
  
    
    public double InterestRate;
    public double savingsBalance;
    public double APR;
    public String savAccountID;
    SimpleBankAccount ba = new SimpleBankAccount();
   /**
    * @param balance
    * @param accountId
    * @param INTEREST_RATE
    */
    public SavingsAccount( double balance, String accountId,double INTEREST_RATE) {
       InterestRate=INTEREST_RATE;
       ba.deposit(balance);
        ba.setAccountId(accountId);
    }

    public SavingsAccount() {
        savingsBalance=ba.balance;
        ba.setAccountId("");
    }
     
    public void applyInterest() {
    APR = InterestRate * savingsBalance ;
    ba.deposit(savingsBalance + APR);
    }   
   /**
    * @return <p> Savings account represented as a String of values
    */
    public String toString(){
        String balanceStr = NumberFormat.getCurrencyInstance().format(ba.getBalance());
        return "Savings Account: " + ba.getAccountId() + "\n" + "Balance for account: "+ balanceStr + "\n" +"APR: " + InterestRate;
    }
    
}
