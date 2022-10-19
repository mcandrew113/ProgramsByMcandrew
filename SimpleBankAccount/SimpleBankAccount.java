/**
 * Simple representation of a bank account
 *
 * @author Hyrum D. Carroll
 * @version 0.5 (10/12/2020)
 */
package SimpleBankAccount;

import java.text.NumberFormat;

public class SimpleBankAccount{
    // fields (instance variables)
    private double balance;
    private String accountId;

    /**
     * Constructor for objects of class SimpleBankAccount
     */
    public SimpleBankAccount(){
        balance = 0.0;
        accountId = "";
    }

    /**
     * Constructor for objects of class SimpleBankAccount
     */
    public SimpleBankAccount( double bal, String id ){
        balance = bal;
        accountId = id;
    }

    /**
     * Add money to the balance
     *
     * @param  amount the amount to deposit
     * @return void
     */
    public void deposit( double amount ){
        balance += amount;
    }

    /**
     * Remove money from the balance
     *
     * @param  amount the amount to withdraw
     * @return true (success) or false (failure)
     */
    public boolean withdraw( double amount ){
        if( balance - amount >= 0 ){
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }

    /**
     * Get the balance
     *
     * @return the balance
     */
    public double getBalance(){
         return balance;
    }

    /**
     * Set account ID
     *
     * @param the account ID
     */
    public void setAccountId(String id){
         accountId = id;
    }


    /**
     * Get the account ID
     *
     * @return the account ID
     */
    public String getAccountId(){
         return accountId;
    }

    /**
     * Produces a string represenation of the balance
     * @return The balance (with a label)
     */
    public String toString( ){
        // display balance as currency
        String balanceStr = NumberFormat.getCurrencyInstance().format( balance );
        return "Balance for account " + accountId + ": " + balanceStr + "\n";
    }

  //

    public static void main( String[] args ){
        CheckingAccount checking = new CheckingAccount( 100.0, "checking123" );
        SavingsAccount savings = new SavingsAccount( 1000.0, "savings124", SavingsAccount.INTEREST_RATE );

        CheckingAccount checkingCopy = new CheckingAccount( 100.0, "checking123" );
        SavingsAccount savingsCopy = new SavingsAccount( 1000.0, "savings124",  SavingsAccount.INTEREST_RATE );

        if( checking.equals( checkingCopy ) == false ){
            System.err.println("ERROR: The following objects are equal:");
            System.err.println( checking );
            System.err.println( checkingCopy );
        }

        if( savings.equals( savingsCopy ) == false ){
            System.err.println("ERROR: The following objects are equal:");
            System.err.println( savings );
            System.err.println( savingsCopy );
        }
        int electricBillCheckNum = 2123;
        double electricBill = 60.34;
        double futureCar = 200.0;

        checking.processCheck( electricBillCheckNum, electricBill );

        savings.deposit( futureCar );
        savings.applyInterest( );

        if( checking.equals( checkingCopy ) == true ){
            System.err.println("ERROR: The following objects are NOT equal:");
            System.err.println( checking );
            System.err.println( checkingCopy );
        }

        if( savings.equals( savingsCopy ) == true ){
            System.err.println("ERROR: The following objects are NOT equal:");
            System.err.println( savings );
            System.err.println( savingsCopy );
        }
    }

}

