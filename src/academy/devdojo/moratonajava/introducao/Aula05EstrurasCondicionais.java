package academy.devdojo.moratonajava.introducao;

public class Aula05EstrurasCondicionais {
    public static void main(String[] args) {

        int idade = 15;

        boolean iSAutorizadoComprarBebida = idade >= 18;

        if (iSAutorizadoComprarBebida) {
            System.out.println("Autorizado a com a comprar bebida alcólica");
        } else{
            System.out.println("Não Autorizado a com a comprar bebida alcólica");
        }
        if (!iSAutorizadoComprarBebida) {
            System.out.println("Não Autorizado a com a comprar bebida alcólica");
        }
        System.out.println("fora do if");
    }

}

