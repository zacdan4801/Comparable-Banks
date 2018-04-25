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
        
        
        
        
        
        boolean run = true;
        while( run )
        {
            System.out.println("1. Add Bank Account/n2. Add Saving Account/n3. Print by Account Number/n4. Print by Account Name");
            Scanner sc = new Scanner(System.in);
            Scanner kb = new Scanner(System.in);
            String response = sc.nextLine();
            switch(response)
            {
                case "1":
                {
                    System.out.print("Please enter name: ");
                    String name = kb.nextLine();
                    System.out.print("Please enter balance: ");
                    double balance = kb.nextDouble();
                    BankAccount ba = new BankAccount( name, balance);
                    b.addAccount( ba );
                }
                case "2":
                {
                    System.out.print("Please enter name: ");
                    String name = kb.nextLine();
                    System.out.print("Please enter balance: ");
                    double balance = kb.nextDouble();
                    System.out.print("Please enter rate: ");
                    double rate = kb.nextDouble();
                    BankAccount ba = new SavingsAccount( name, balance, rate);
                    b.addAccount( ba );
                }
                case "3":
                {
                    sortByAccountName( b );
                }
                case "4":
                {
                    sortByAccountNumber( b );
                }
            }
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
