package bagsharu.principal;

import bagsharu.api.ConsultarMoeda;
import bagsharu.api.Info;

import java.io.IOException;
import java.util.Scanner;

public class ConversaoPrincipal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner entrada = new Scanner(System.in);
        ConsultarMoeda consultarMoeda = new ConsultarMoeda();
//
//        System.out.println("Insira sua API Key para consultar");
//        String KEY = entrada.nextLine();

//        System.out.println("Digite o valor que deseja converter:");
//        double valorConversao = entrada.nextDouble();
//
//        Info valores = consultarMoeda.Consultar(KEY,"USD","BRL", valorConversao);
//        System.out.printf("O valor em %s %.2f corresponde ao valor aproximado de: %.2f %s",valores.base_code(), valorConversao, valores.conversion_result(), valores.target_code());

        String menu = "\n ---------------------------------" +
                      "\n Boas-vindas ao Conversor de Moedas!" +
                      "\n " +
                      "\n Escolha entre as opções válidas qual conversão deseja realizar!" +
                      "\n 1) Dólar para Real" +
                      "\n 2) Real para Dólar" +
                      "\n 3) Dólar para Euro" +
                      "\n 4) Euro para Dólar" +
                      "\n 5) Real para Euro"  +
                      "\n 6) Euro para Real"  +
                      "\n Insira -1 para finalizar operações." +
                      "\n ---------------------------------";

        System.out.println(menu);
    }
}
