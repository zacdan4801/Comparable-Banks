import java.util.*;
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        Bank b = new Bank( "Bank of OSSM", 2 );
        
        BankAccount ba = new BankAccount("Bob", 1500);
        SavingsAccount sa = new SavingsAccount( "Jane", 1000, 0.07 );
        BankAccount ba2 = new BankAccount("Sam", 5000);
        
        b.addAccount( ba );
        b.addAccount( sa );
        b.addAccount( ba2 );
        
        System.out.println();
        System.out.println( b );
        
        boolean run = true;
        while( run )
        {
            System.out.println("1. Add Bank Account/n2. Add Saving Account/n3. Print by Account Number/n4. Print by Account Name");
            Scanner sc = new Scanner(System.in);
        }
    }
    
    public static BankAccount[] sortByAccountNumber( Bank b )
    {
        BankAccount[] accounts = b.getAllAccounts();
        
        for( int low = 0; low < accounts.length - 1; low++)
        {
            for( int high = low + 1; high < accounts.length; high++)
            {
                if( accounts[low].getAccountNumber() > accounts[high].getAccountNumber())
                {
                    BankAccount temp = accounts[low];
                    accounts[low] = accounts[high];
                    accounts[high] = temp;
                }
            }
        }
        return accounts;
    }
    
    public static BankAccount[] sortByAccountName( Bank b )
    {
        for( int low = 0; low < accounts.length - 1; low++)
        {
            for( int high = low + 1; high < accounts.length; high++)
            {
                if( accounts[low].getAccountNumber() > accounts[high].getAcountNumber())
                {
                    BankAccount temp = accounts[low];
                    accounts[low] = accounts[high];
                    accounts[high] = temp;
                }
                else if( accounts[low].getName().compareTo(accounts[high].getName()) == 0)
                {
                    if( accounts[low].getBalance() > accounts[high].getBalance())
                    {
                        BankAccount temp = accounts[low];
                        accounts[low] = accounts[high];
                        accounts[high] = temp;
                    }
                    else if( accounts[low].getBalance() == accounts[high].getBalance())
                    {
                        if( accounts[low].getAccountNumber() > accounts[high].getAccountNumber())
                        {
                            BankAccount temp = accounts[low];
                            accounts[low] = accounts[high];
                            accounts[high] = temp;
                        }
                    }
                }
            }
        }
        return accounts;
    }
    
    
}
