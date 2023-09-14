package enumabstract;

public enum Discount {

    SPECIAL_OFFER {
        @Override
        double getAmountToPay(int price, int pieces) {
            return price * pieces * 0.8;
        }
    },

    BLACK_FRIDAY_OFFER {
        @Override
        double getAmountToPay(int price, int pieces) {
            if (pieces < 3) {
                return price * pieces * 0.75;
            } else {
                return price * 0.5 + price * 0.75 * (pieces - 1);
            }
        }
    };

    abstract double getAmountToPay(int price, int pieces);
}
