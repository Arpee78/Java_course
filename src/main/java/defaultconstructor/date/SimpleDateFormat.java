package defaultconstructor.date;

import java.util.Locale;

public class SimpleDateFormat {

    CountryCode countryCode;

    public SimpleDateFormat() {
        this.countryCode = CountryCode.valueOf(Locale.getDefault().getCountry());
    }

    public String formatDateString(SimpleDate simpleDate) {
        if (countryCode.name().equals("HU")) {
            return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
        }

        if (countryCode.name().equals("EN")) {
            return simpleDate.getDay() + "-" + simpleDate.getMonth() + "-" + simpleDate.getYear();
        }

        if (countryCode.name().equals("US")) {
            return simpleDate.getMonth() + "-" + simpleDate.getDay() + "-" + simpleDate.getYear();
        }
        throw new IllegalArgumentException("Incorrect default countryCode" + countryCode.name());
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        this.countryCode = countryCode;
        return this.formatDateString(simpleDate);
    }
}