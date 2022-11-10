public class Account{

    //Attributes
    AccountHolder Holder;
    double balance = 0.0;

    //Constructor
    public Account(double amount, AccountHolder Holder){
        balance = amount;
        this.Holder = Holder;
    }

    //Methods
    public void deposite(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
    public AccountHolder getHolder(){
        return Holder;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setHodler(AccountHolder Holder){
        this.Holder = Holder;
    }


}