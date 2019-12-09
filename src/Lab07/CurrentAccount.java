package Lab07;

import Lab06.Account;

public class CurrentAccount extends Account {
    String accName;
    int numberOfWithDraws;
    double withDrawAmountLimit;

    public double getWithDrawAmountLimit() {
        return withDrawAmountLimit;
    }

    public void setWithDrawAmountLimit(double withDrawAmountLimit) {
        this.withDrawAmountLimit = withDrawAmountLimit;
    }

    CurrentAccount(double balance, String accName, int withDrawLimit, double withDrawAmountLimit) {
        super(balance);
        this.accName = accName;
        setWithDrawLimit(withDrawLimit);
        this.numberOfWithDraws = getWithDrawLimit();
        setWithDrawAmountLimit(withDrawAmountLimit);
    }

    @Override
    public void withDraw(double amount) {
//        super.withDraw(amount);
        if (amount < getWithDrawAmountLimit()) {
            if (amount > getBalance()) {
                System.out.println("Withdraw rejected balance is low: INR " + getBalance());
            } else {
                numberOfWithDraws++;
                if (numberOfWithDraws >= getWithDrawLimit()) {
                    double withDrawCharge = 0.005 * amount;
                    amount += withDrawCharge;
                }
                setBalance(getBalance() - amount);
                System.out.println("Withdraw success, balance is now: INR " + getBalance());
//            transactions.add(accountNumber + "|WithDraw:INR " + amount + "|Time: " + dtf.format(now));
            }
        } else {
            System.out.println("Withdraw limit exceed");
        }
    }
}
