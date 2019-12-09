package Lab06;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;


    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setWithDrawLimit(int withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }

    private int withDrawLimit = 3;

    public int getWithDrawLimit() {
        return withDrawLimit;
    }


    private int numberOfWithDraws;
    private List<Transaction> transactions = new ArrayList<>();

//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//    LocalDateTime now = LocalDateTime.now();

    public Account(double theBalance) {
        accountNumber = (int) (Math.random() * 100);
        if (theBalance > 10000) {
            balance = theBalance;
            Transaction txn = new Transaction("Balance", theBalance);
            transactions.add(txn);
//            transactions.add(accountNumber + "|Balance:INR " + theBalance + "|Time: " + dtf.format(now));
        } else {
            System.out.println("Balance must be greater than INR 10000");
        }

    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited, current balance: INR " + getBalance());
        Transaction txn = new Transaction("Deposit", amount);
        transactions.add(txn);
//        transactions.add(accountNumber + "|Deposit:INR " + amount + "|Time: " + dtf.format(now));
    }

    public void withDraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdraw rejected balance is low: INR " + getBalance());
        } else {
            numberOfWithDraws++;
            if (numberOfWithDraws >= withDrawLimit) {
                double withDrawCharge = 0.005 * amount;
                amount += withDrawCharge;
            }
            balance -= amount;
            System.out.println("Withdraw success, balance is now: INR " + getBalance());
            Transaction txn = new Transaction("WithDraw", amount);
            transactions.add(txn);
//            transactions.add(accountNumber + "|WithDraw:INR " + amount + "|Time: " + dtf.format(now));
        }
    }


    public double getBalance() {
        return balance;
    }

    public void printBalance() {
        System.out.println("Your Balance is: INR " + balance);
    }

    public void getTransactions() {
        System.out.println();
        System.out.println("Total transactions:" + transactions.size());
//        for (int i = 0; i < transactions.size(); i++) {
//            System.out.println(transactions.get(i));
//        }
        for (Transaction txn :
                transactions
        ) {
            System.out.println(txn.getType() + " ==> ₹ " + txn.getAmount() + " at " + txn.getDate());
        }

    }

    //TODO: Add transaction logger here
}
