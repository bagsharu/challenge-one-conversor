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

        System.out.println("Insira sua API Key para consultar");
        String KEY = entrada.nextLine();


//


        int comando = 0;
        double valorConversao = 0;

        // Laço de repetição while para "rodar" a aplicação
        while (comando != -1) {
            System.out.println(myMenu);
            System.out.println("\n Digite qual operação deseja realizar");
            comando = entrada.nextInt();

            switch (comando) {
                // Dólar para Real
                case 1:
                    valorConversao = consultarMoeda.receberValor();

                    Info valores = consultarMoeda.Consultar(KEY,"USD","BRL", valorConversao);
                    consultarMoeda.imprimirConversao(valores, valorConversao);
                    break;
                // Real para Dólar
//                case 2:

            }
        }


    }
}
