
/**
 * Write a description of class SavingsAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SavingsAccount extends BankAccount
{
    private double rate;
    
    public SavingsAccount( String name, double deposit, double rate )
    {
        super(name, deposit);
        this.rate = rate;
    }
    
    public void addInterest()
    {
        // Compute the interest
        double interest = this.getBalance()*rate;
        // Add that interest to the balance
        this.deposit( interest );
    }
    
    public double getRate()
    {
        return rate;
    }
}
