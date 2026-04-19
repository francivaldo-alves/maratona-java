package academy.devdojo.moratonajava.introducao;

public class Aula05EstruturasCondcionais06 {
    public static void main(String[] args) {
//      byte diaSemana = 5;
//        switch (diaSemana) {
//            case 1:
//                System.out.println("Domingo - Final de Semana");
//                break;
//            case 2:
//                System.out.println(" Segunda -  Dia Útil");
//                break;
//            case 3:
//                System.out.println("Terça - Dia Útil");
//                break;
//            case 4:
//                System.out.println("quanta - Dia Útil");
//                break;
//            case 5:
//                System.out.println("quinta - Dia Útil");
//                break;
//            case 6:
//                System.out.println("sexta - Dia Útil");
//                break;
//            case 7:
//                System.out.println("Sábado - Final de Semana");
//                break;
//            default:
//                System.out.println("opção inválida");
//        }
//
        byte dia = 10;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }
    }


}
