package SimpleBankAccount;
/**
 * An extension of type SimpleBankAccount 
 * 
 * @class CheckingAccount
 * @Author Mcandrew Okwei 8 October 2022
 */
public class CheckingAccount extends SimpleBankAccount {
    
    private int checkNumber;    
    
    SimpleBankAccount ba = new SimpleBankAccount();
    
    public CheckingAccount() {
        ba.getBalance();
        ba.setAccountId("");
    }
/**
 * Use construtor to adjust checking account object
 * 
 * @param balance
 * 
 * <p> call deposit in this constructor to set initial balance</p>
 * 
 * @param accountID
 * 
 * <p> call setAccountId in this constructor to set the bank account</p>
 */
    public CheckingAccount(double balance, String accountID) {
        ba.deposit(balance);
        ba.setAccountId(accountID);
    }
    /**
     * process a given check
     * 
     * @param checkNum 
     * @param amount
     * @return 
     * 
     * <p> true only if this check isn't used twice </p>
     */
    public boolean processCheck(int checkNum, double amount ) {
        if (checkNum == checkNumber) 
        {            
            return false;
        } else {
            checkNumber = checkNum;
            ba.withdraw(amount);
            return true;
            }
    }
    
/**
 * call to string to return accountid balance & check# as a string
 * 
 * @return CheckingAccount()
 */
   public String toString(){
return "Checking Account:" + ba.getAccountId() + "\n" + "Balance for account: $" + ba.balance + "\n" +  "Last processed check number:  " + checkNumber;
   }
    
}
