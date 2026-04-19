package academy.devdojo.moratonajava.introducao;

public class Aula05EstruturasCondcionais03 {
    public static void main(String[] args) {
        double salario = 1000;
        String mensagemDoar = "Vou doar 500 pro Fran";
        String mensagemNaoDoar = " Não Vou doar 500 pro Fran, mas vou ter!";

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);


    }
}
