package day41_Inheritance;

public class BankAccount {
    public static String bankName = "Bank of America";
    public String firstname;
    public String lastname;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String firstname, String lastname){
        accountHolder = firstname+" "+lastname;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void depositing(int amount){
        setBalance(balance+amount);
    }
    public void withdrawing(int amount){
      //  balance -= amount;
        setBalance(balance-amount);
    }

    public void checkBalance(){
        System.out.println("Available Balance: "+balance);
    }
    public String toString(){
        return "FullName: "+accountHolder;
    }
}
