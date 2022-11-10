public class CorporateHolder extends AccountHolder{
    //Attributes
    String contact;

    //Constructor
    public CorporateHolder(String Add, int ID, String contact) {
        super(Add, ID);
        this.contact = contact;
    }
    
    //Methods
    public String getContact(){
        return contact;
    }

    public void setContact(String contact){
        this.contact = contact;
    }
    
}
