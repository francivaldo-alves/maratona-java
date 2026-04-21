package academy.devdojo.moratonajava.introducao;

public class Aula06EstrturaDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for

        int contador = 0;
        while (contador < 10) {
            System.out.println("While " + ++contador);
        }

        contador = 0;

        do {
            System.out.println("do-While " + ++contador);
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("for i = " + i);
        }
    }


}
