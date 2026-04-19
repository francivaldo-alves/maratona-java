package academy.devdojo.moratonajava.introducao;

public class Aula05EstruturasCondcionais02 {
    public static void main(String[] args) {
        int indade = 1000;
        String categoria;

        if (indade < 15) {
            categoria = "Categoria infantil";
        } else if (indade >= 15 && indade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);

    }
}
