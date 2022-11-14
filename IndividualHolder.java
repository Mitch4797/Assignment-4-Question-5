public class IndividualHolder  extends AccountHolder implements util{
    //Attributes
    protected String name;
    protected int SSN;

    //Constructor
    public IndividualHolder(int ID, String Add, String name, int SSN) 
    {
        super(Add, ID);
        this.name = name;
        this.SSN = SSN;
    }

    //Methods
    public String getName(){
        return name;
    }

    public int getSSN(){
        return SSN;
    }

    public void setName(String Name){
        this.name = Name;
    }

    public void setSSN(int SSN){
        this.SSN = SSN;
    }

    @Override
    public String convertNameUpperCase(String Name){
        return name.toUpperCase();
    }
    
}
