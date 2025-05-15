package service;

import api.ExchangeRateApiClient;
import model.ExchangeRatesResponse;

public class CurrencyConverterService {

    private final ExchangeRateApiClient apiClient = new ExchangeRateApiClient();

    public double convert(String from, String to, double amount) {
        ExchangeRatesResponse response = apiClient.getRates(from);

        if (response == null) {
            System.err.println("[ALERT] Não foi possível obter as cotações. Conversão cancelada.");
            return 0;
        }

        Double rate = response.getConversionRates().get(to);

        if (rate == null) {
            System.err.println("[ALERT] Moeda destino inválida.");
            return 0;
        }

        return amount * rate;
    }
}
