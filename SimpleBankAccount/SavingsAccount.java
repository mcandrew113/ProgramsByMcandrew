package SimpleBankAccount;

//import java.text.NumberFormat;

public class SavingsAccount extends SimpleBankAccount {
      public static final double INTEREST_RATE = 0.01;
    public double InterestRate;
    
    @Override
    public boolean  equals( Object obj){    
        if (!(obj instanceof SavingsAccount)) {
            return false;}
            else if (obj instanceof SavingsAccount) {
                SavingsAccount other = (SavingsAccount) obj;
                if (this.getBalance() == other.getBalance() && this.getAccountId() == other.getAccountId() && this.InterestRate == other.InterestRate) {
                    return true;}
                else {
                    return false;}
            }
            else {
                return false;}
        }
           
       



    public SavingsAccount( double balance, String accountId,double INTEREST_RATE) {
       InterestRate=INTEREST_RATE;
       this.deposit(balance);
        this.setAccountId(accountId);
    }

    public SavingsAccount(){        super(); }
      
    public void applyInterest() {
        this.deposit(this.getBalance() * InterestRate) ;
    }   
   
@Override
    public String toString(){
        return "Savings Account:\n Balance for account " + this.getAccountId() + ":  " + this.getBalance() + "\nAPR:  " + InterestRate *100;
    }
    
}
