public class IfElse {
    public static void main(String[] args) {

        int numero = 8;

//        if
        if(numero % 2 == 0){
        System.out.println("O numero eh par.");}

//        if else
        if (numero > 0) {
            System.out.println("\nO numero eh positivo.");
        } else {
            System.out.println("\nO numero eh zero ou negativo.");
        }

//        if else if
        if (numero >= 7) {
            System.out.println("\nParabens, vc foi aprovado.");
        } else if (numero >= 5 && numero < 7) {
            System.out.println("\nVoce esta de recuperacao");
        } else if (numero < 5){
            System.out.println("\nVoce esta reprovado.");
        } else {
            System.out.println("ERRO.");
        }
    }
}
