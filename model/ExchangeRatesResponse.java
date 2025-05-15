package model;

import java.util.Map;

public class ExchangeRatesResponse {
    private String result;
    private String base_code;
    private Map<String, Double> conversion_rates;

    public String getResult() {
        return result;
    }

    public String getBase_code() {
        return base_code;
    }

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }
}
