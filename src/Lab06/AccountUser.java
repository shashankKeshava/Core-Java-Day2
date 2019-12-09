package Lab06;

public class AccountUser {
    public static void main(String[] args) {
        Account user1 = new Account(20000);

        user1.deposit(100);
        user1.deposit(500);

        user1.withDraw(200);
        user1.withDraw(100);
        user1.withDraw(300);
        user1.withDraw(400);

        user1.printBalance();
        user1.getTransactions();
    }
}
