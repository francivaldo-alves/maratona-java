package academy.devdojo.moratonajava.introducao;

import java.util.Arrays;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 22;
        idades[2] = 23;
        System.out.println(Arrays.copyOf(idades, 3));
        System.out.println("Idades: " + Arrays.toString(idades));
    }
}
