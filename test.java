public class test {
    
    public static void main(String args[]){
        System.out.println("\nThis is a test program for the Classes");

        IndividualHolder holder1 = new IndividualHolder(0, "123 Home Road", "Test Human", 987654321);

        //Test section 1
        Account holder1account = new Account(0, holder1);
        System.out.println(holder1account.getBalance());
        holder1account.setBalance(50);
        System.out.println(holder1account.getBalance());
        holder1account.deposite(40);
        System.out.println(holder1account.getBalance());
        holder1account.withdraw(30);
        System.out.println(holder1account.getBalance());

        //Test section 2
        System.out.println(holder1.getName());
        System.out.println(holder1.convertNameUpperCase(holder1.getName()));

        //Test static method


        System.out.println("\n\n");
    }
}
