package SimpleBankAccount;

public class CheckingAccount extends SimpleBankAccount {
    
    public int checkNumber;
    //SimpleBankAccount ba = new SimpleBankAccount();
    
    
    public CheckingAccount() {}

    @Override
    public boolean  equals( Object obj){    
        if (!(obj instanceof CheckingAccount)) {
            return false;}
            else if (obj instanceof CheckingAccount) {
                CheckingAccount other = (CheckingAccount) obj;
                if (this.getBalance() == other.getBalance() && this.getAccountId() == other.getAccountId() && this.checkNumber == other.checkNumber) {
                    return true;}
                else {
                    return false;}
            }
            else {
                return false;}
        }

    public CheckingAccount(double balance, String accountID) {        
       this.deposit(balance);
        this.setAccountId(accountID);
    }
    
    public boolean processCheck(int checkNum, double amount ) {
        if (checkNum == checkNumber) 
        {            
            return false;
        } else {
            checkNumber = checkNum;
            this.withdraw(amount); 
            return true;
            }
    }
    
@Override
   public String toString(){
    super.toString();
return "Checking Account:\n Balance for account " + this.getAccountId() + ":  $" + this.getBalance() + "\nLast processed check number:  " + checkNumber;
   }
    
}
