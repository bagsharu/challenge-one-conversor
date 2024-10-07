package bagsharu.api;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoeda {

    public Info Consultar(String API_KEY,String valorConsulta, String valorConvertido) {

        // Variável para consultar a moeda desejada
        var buscar = "https://v6.exchangerate-api.com/v6/" + API_KEY +"/pair/"+ valorConsulta + "/" + valorConvertido;

        // Requisição para API
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(buscar))
                .build();

        try {
            // Serialização
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Retorna um Info com os valores do json
            return new Gson().fromJson(response.body(), Info.class);
        } catch (Exception e) {
            // Caso encontre erros na requisição
            throw new RuntimeException("Não foi possível realizar a operação.");
        }

    }
}
