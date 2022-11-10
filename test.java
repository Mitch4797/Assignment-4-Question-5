public class test {
    
    public static void main(String args[]){
        System.out.println("\nThis is a test program for the Classes");
        IndividualHolder holder1 = new IndividualHolder(0, "123 Home Road", "Test Human", 987654321);

        Account holder1account = new Account(100, holder1);
        System.out.println(holder1account.getBalance());
        holder1account.deposite(40);
        System.out.println(holder1account.getBalance());
        holder1account.withdraw(100);
        System.out.println(holder1account.getBalance());


        System.out.println("\n\n");
    }
}
