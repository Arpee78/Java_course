package interfacedependencyinversion.amount;

public class Cash implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        int lastDigit = amount % 10;
        int rounded = amount / 10 * 10;

         if (lastDigit > 2 && lastDigit < 8) {
            return rounded + 5;
        }

        if (lastDigit > 7) {
            return rounded + 10;
        }

        return rounded;

    }
}
