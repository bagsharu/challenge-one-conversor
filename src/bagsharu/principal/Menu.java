package bagsharu.principal;

public class Menu {

    // Formatação do menu
    private String menu = "\n ---------------------------------" +
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
    @Override
    public String toString() {
        return menu;
    }
}
