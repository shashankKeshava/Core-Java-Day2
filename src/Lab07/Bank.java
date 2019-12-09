package Lab07;

public class Bank {
    public static void main(String[] args) {
        CurrentAccount cust1 = new CurrentAccount(100000, "Current Account", 10, 100000);
        PremiumAccount pCust2 = new PremiumAccount(1000000);
        System.out.println(cust1.getBalance());
        System.out.println(pCust2.getBalance());
    }
}
