package academy.devdojo.moratonajava.introducao;

public class Aula06EstrturaDeRepeticao04 {
    public static void main(String[] args) {

        double valorTotal = 30000.00;
        for (int parcela =1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                break;

            }
            System.out.println("Parcela: " + parcela + "R$ " + valorParcela);
        }
    }
}
