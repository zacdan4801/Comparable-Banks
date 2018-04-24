
/**
 * Write a description of class BankAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount extends Account
{
    private static int accountNumbers = 1;
    
    private double balance;
    
    public BankAccount( String name, double deposit )
    {
        super( name, accountNumbers );
        accountNumbers++;
        
        balance = deposit;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public int getAccountNumber()
    {
        return accountNumbers;
    }
    
    public void deposit( double deposit )
    {
        balance += deposit;
    }
    
    public void withdraw( double amount )
    {
        balance -= amount;
    }
    
    public String toString()
    {
        return "The bank account with name " + this.getName() + " and account number " +
               this.getAccountNumber() + " has balance of " + this.getBalance() + ".";
    }
    
}
