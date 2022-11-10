import java.util.Random;

public class AccountHolder {
    //Attributes
    private String Address;
    private int ID;

    //Contrustor
    public AccountHolder(String Add, int ID)
    {
        this.Address = Add;
        this.ID = ID;
    }

    //getNextID method should return a random value between 0 and 1000 
    public static int getNextID()
    {
        Random rand = new Random();
        return rand.nextInt(1000);
    }

}
