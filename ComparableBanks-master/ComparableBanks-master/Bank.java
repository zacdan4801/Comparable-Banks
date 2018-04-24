import java.util.ArrayList;
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank
{
    private ArrayList<BankAccount> accounts;
    private String name;
    private int numOfEmployees;
    
    public Bank( String name, int num )
    {
        this.name = name;
        this.numOfEmployees = num;
        accounts = new ArrayList<BankAccount>();
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumOfEmployees()
    {
        return numOfEmployees;
    }
    
    public void addAccount( BankAccount b )
    {
        accounts.add(b);
    }
    
    public BankAccount[] getAllAccounts()
    {
        
        return accounts.toArray(new BankAccount[1]);
        
        
        
    }
    
    public BankAccount getAccount( int accountNumber )
    {
        for(int j = 0; j < accounts.size(); j++)
        {
            if(  (accounts.get( j )).getAccountNumber() == accountNumber )
            {
                return accounts.get( j );
            }
        }
        
        return null;
    }
    
    public BankAccount getAccount( String username )
    {
        for(int j = 0; j < accounts.size(); j++)
        {
            if( (accounts.get( j )).getName().equals( username ) )
            {
                return accounts.get( j );
            }
        }
        
        return null;
    }
    
    public void deposit( BankAccount b, double amount )
    {
        b.deposit( amount );
    }
    
    public void withdraw( BankAccount b, double amount )
    {
        b.withdraw( amount );
    }
    
    public double getBalance( BankAccount b )
    {
        return b.getBalance();
    }
    
    public String toString()
    {
        String s = "";
        
        s += "BankName=" + name + "\n";
        s += "NumberofEmployees=" + numOfEmployees + "\n";
        for( BankAccount b : accounts )
        {
            if( b instanceof SavingsAccount )
            {
                SavingsAccount sa = (SavingsAccount)b;
                s += "SavingsAccount=" + sa.getName() + "\n";
                s += "AccountNumber=" + sa.getAccountNumber() + "\n";
                s += "Balance=" + sa.getBalance() + "\n";
                s += "Rate=" + sa.getRate() + "\n";
            }
            else
            {
                s += "BankAccount=" + b.getName() + "\n";
                s += "AccountNumber=" + b.getAccountNumber() + "\n";
                s += "Balance=" + b.getBalance() + "\n";
            }
        }
        
        return s;
    }
    
}
