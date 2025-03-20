class BankAccount1 {
    private String owner;
    private double balance;


    public BankAccount1(double balance) {
        this.balance = balance;
    }
    public boolean debit(double a) {
        if (a < balance) return true;
        else return false;
    }
    public void credit ( double b){
        this.balance += b;
    }
    
}
public class BankAccount {
    public static void main(String[]  args) {
        BankAccount1 a= new BankAccount1(50);
        
        System.out.println(a.debit(10));
    }
    
}
