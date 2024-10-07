package bagsharu.api;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultarMoeda {

    public Info Consultar(String API_KEY,String valorConsulta, String valorConvertido, double valorConversao) {

        // Variável para consultar a moeda desejada
        var buscar = "https://v6.exchangerate-api.com/v6/" + API_KEY +"/pair/"+ valorConsulta + "/" + valorConvertido + "/" + valorConversao;

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

    public void imprimirConversao(Info informacoes, double valorConversao) {

        System.out.printf("O valor em %s %.2f corresponde ao valor aproximado de: %.2f %s",informacoes.base_code(), valorConversao, informacoes.conversion_result(), informacoes.target_code());
    }

    public double receberValor() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor que deseja converter:");
        double valorConversao = entrada.nextDouble();

        return valorConversao;
    }
}
