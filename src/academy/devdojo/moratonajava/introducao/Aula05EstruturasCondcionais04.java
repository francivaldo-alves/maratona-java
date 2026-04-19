package academy.devdojo.moratonajava.introducao;

public class Aula05EstruturasCondcionais04 {

    public static void main(String[] args) {

        double salarioAnual = 45000;
        double primeiraFaixa = 9.70 / 100;
        double segundsFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundsFaixa;

        } else {
            valorImposto = salarioAnual * terceiraFaixa;

        }
        System.out.println(valorImposto);


    }
}
