package initializer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCard {

    public static final List<Rate> ACTUAL_RATES;

    static {
        ACTUAL_RATES = Arrays.asList(
                new Rate(Currency.HUF, 1.0),
                new Rate(Currency.EUR, 308.23),
                new Rate(Currency.CHF, 289.24),
                new Rate(Currency.GBP, 362.23),
                new Rate(Currency.USD, 289.77)
        );
    }

    private long balance;

    public CreditCard(long balance, Currency currency) {
        this.balance = Math.round(balance * getRate(currency).getConversionFactor());
    }

    private Rate getRate(Currency currency) {
        for (Rate r : ACTUAL_RATES) {
            if (r.getCurrency().equals(currency)) {
                return r;
            }
        }
        throw new IllegalArgumentException("Cannot find this currency");
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }


    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {
        long amountInHuf = Math.round(amount * getRate(currency).getConversionFactor());
        if (balance < amountInHuf) {
            return false;
        }
        balance -= amountInHuf;
        return true;
    }

    public boolean payment(long amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
