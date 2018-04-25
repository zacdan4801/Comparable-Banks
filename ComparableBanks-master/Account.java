
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    private int number;
    private String name;
    
    public Account(String name, int accountNumber )
    {
        number = accountNumber;
        this.name = name;
    }
    
    public int getAccountNumber()
    {
        return this.number;
    }
    
    public String getName()
    {
        return this.name;
    }
    
}
