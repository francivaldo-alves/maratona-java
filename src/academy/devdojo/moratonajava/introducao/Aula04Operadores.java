package academy.devdojo.moratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        //<>  <= >=  == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println( isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        // && (AND) || (or) ! (NOT)

        int idade = 35;
        float salario =3500F;
        boolean isDentroDaLeiMaiorQueTrinta= idade >30 && salario >= 4612;
        boolean isDentroDaLeMenorQueTrinta= idade <30 && salario >= 3381;

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation =5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >valorPlaystation || valorTotalContaPoupanca >valorPlaystation;
        System.out.println( "isPlaystationCincoCompravel " + isPlaystationCincoCompravel );

        // = += -= /= %=

        double bonus = 1800;
        bonus +=1000;
        System.out.println( bonus );
        bonus -= 1000;
        System.out.println( bonus );
        bonus *= 2;
        System.out.println( bonus );
        bonus %= 2;
        System.out.println( bonus );

        // ++  --
        int contator =0;
        contator++;
        contator--;
        ++contator;
        --contator;
        System.out.println( contator );

    }
}
