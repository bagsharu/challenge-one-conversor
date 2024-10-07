package bagsharu.principal;

import bagsharu.api.ConsultarMoeda;
import bagsharu.api.Info;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversaoPrincipal {
    public static void main(String[] args) throws IOException, InterruptedException {


//
//        System.out.println(valores.base_code());
//        System.out.println(valores.target_code());
//        System.out.println(valores.conversion_rate());
//        System.out.println(valores.conversion_result());
//
//        System.out.println(valores.BRL());
//        System.out.println(valores.USD());
//        System.out.println(valores.EUR());

        Scanner entrada = new Scanner(System.in);
        ConsultarMoeda consultarMoeda = new ConsultarMoeda();

        System.out.println("Insira sua API Key para consultar");
        String KEY = entrada.nextLine();

        System.out.println("Digite o valor que deseja converter:");
        double valorConversao = entrada.nextDouble();

        Info valores = consultarMoeda.Consultar(KEY,"USD","BRL", valorConversao);
        System.out.printf("O valor em %s %.2f corresponde ao valor aproximado de: %.2f %s",valores.base_code(), valorConversao, valores.conversion_result(), valores.target_code());

//        int controle = 0;
//
//        while (controle != -1) {
//
//            switch (controle) {
//
//                case 1: // Dolar para Real
//
//            }
//        }
    }
}
