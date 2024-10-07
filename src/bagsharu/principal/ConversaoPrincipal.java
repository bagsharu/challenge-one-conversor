package bagsharu.principal;

import bagsharu.api.ConsultarMoeda;
import bagsharu.api.Info;

import java.io.IOException;
import java.util.Scanner;

public class ConversaoPrincipal {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Instanciação de objetos
        Scanner entrada = new Scanner(System.in);
        Menu myMenu = new Menu();
        ConsultarMoeda consultarMoeda = new ConsultarMoeda();

//        System.out.println("Insira sua API Key para consultar");
//        String KEY = entrada.nextLine();

//        System.out.println("Digite o valor que deseja converter:");
//        double valorConversao = entrada.nextDouble();
//
//        Info valores = consultarMoeda.Consultar(KEY,"USD","BRL", valorConversao);
//        System.out.printf("O valor em %s %.2f corresponde ao valor aproximado de: %.2f %s",valores.base_code(), valorConversao, valores.conversion_result(), valores.target_code());

        int comando = 0;

        // Laço de repetição while para "rodar" a aplicação
        while (comando != -1) {
            System.out.println(myMenu);
            System.out.println("\n Digite qual operação deseja realizar");
            comando = entrada.nextInt();
        }


    }
}
