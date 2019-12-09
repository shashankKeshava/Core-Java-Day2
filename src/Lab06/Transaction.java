package Lab06;

import java.util.Date;

public class Transaction {
    String type;

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    double amount;

    public String getType() {
        return type;
    }

    Date date;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        date = new Date();
    }


}
