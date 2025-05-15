package api;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import model.ExchangeRatesResponse;

public class ExchangeRateApiClient {

    private static final String API_KEY = "ac40c35c76005ae587dd8f40";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public ExchangeRatesResponse getRates(String baseCurrency) {
        try {
            URL url = new URL(BASE_URL + baseCurrency);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int status = connection.getResponseCode();

            if (status != 200) {
                System.err.println("[ALERT] Erro na resposta da API: código " + status);
                return null;
            }

            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            ExchangeRatesResponse response = new Gson().fromJson(reader, ExchangeRatesResponse.class);
            reader.close();

            if (response == null || !"success".equalsIgnoreCase(response.getResult())) {
                System.err.println("[ALERT] Resposta inválida da API.");
                return null;
            }

            return response;

        } catch (Exception e) {
            System.err.println("[ALERT] Falha ao conectar ou processar a API: " + e.getMessage());
            return null;
        }
    }
}
