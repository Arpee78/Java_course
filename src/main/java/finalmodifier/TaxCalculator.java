package finalmodifier;

public class TaxCalculator {

    public static final int VAT = 27;

    public double tax(double price){
        return price*VAT/100;
    }

    public double priceWithTax(double price){
        return price*(1+VAT/100.0);
    }

}
