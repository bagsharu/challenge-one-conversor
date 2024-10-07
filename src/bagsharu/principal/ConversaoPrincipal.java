package bagsharu.principal;

import bagsharu.api.ConsultarMoeda;
import bagsharu.api.Info;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversaoPrincipal {
    public static void main(String[] args) throws IOException, InterruptedException {

        ConsultarMoeda consultarMoeda = new ConsultarMoeda();

        Info valores = consultarMoeda.Consultar("8be507e8d1a6865db68cafaf","USD","BRL",10.13);

        System.out.println(valores.base_code());
        System.out.println(valores.target_code());
        System.out.println(valores.conversion_rate());
        System.out.println(valores.conversion_result());

//        System.out.println(valores.BRL());
//        System.out.println(valores.USD());
//        System.out.println(valores.EUR());
    }
}
