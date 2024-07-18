import java.util.Scanner;

public class part2 {

    public static void main(String[] args) {

//        //31
//        System.out.println("JAVA VERSION: " + System.getProperty("java.version"));
//        System.out.println("JRE VERSION: " + System.getProperty("java.runtime.version"));
//        System.out.println("JAVA HOME: " + System.getProperty("java.home"));
//        System.out.println("JAVA VENDOR: " + System.getProperty("java.vendor"));
//        System.out.println("JAVA VENDOR URL: " + System.getProperty("java.vendor.url"));
//        System.out.println("JAVA CLASS PATH: " + System.getProperty("java.class.path"));

//        //32
        Scanner entrada = new Scanner(System.in);
//        int int1 = entrada.nextInt();
//        int int2 = entrada.nextInt();
//
//        if (int1 == int2) {
//            System.out.println(int1 + " == " + int2);
//        }
//
//        if (int1 != int2){
//            System.out.println(int1 + " != " + int2);
//        }
//
//        if (int1 < int2){
//            System.out.println(int1 + " < " + int2);
//        }
//
//        if (int1 > int2){
//            System.out.println(int1 + " > " + int2);
//        }
//
//        if (int1 <= int2){
//            System.out.println(int1 + " <= " + int2);
//        }
//
//        if (int1 >= int2){
//            System.out.println(int1 + " >= " + int2);
//        }

//        //33
//        int x = entrada.nextInt();
//        String conversao = String.valueOf(x);
//
//        char primeiraPosicao = conversao.charAt(0);
//        char segundaPosicao = conversao.charAt(1);
//
//        int primeiroNumero = Integer.parseInt(String.valueOf(primeiraPosicao));
//        int segundoNumero = Integer.parseInt(String.valueOf(segundaPosicao));
//
//        System.out.println("Primeira posicao do numero digitado: " + primeiraPosicao);
//        System.out.println("Segunda posicao do numero digitado: " + segundaPosicao);
//        System.out.println("Soma das duas posicoes: " + (primeiroNumero + segundoNumero));
//
//        System.out.println("A soma dos numeros eh: " + sumDigits(x));

//        //34
//        final double PI = 3.1416d;
//        double lado = entrada.nextDouble();
//        double area = (6 * (lado * lado)) / (4 * Math.tan(PI / 6));
//        System.out.println("Area do Hexagono: " + area);

//        //35
//        double quantidadeLados = entrada.nextDouble();
//        double comprimentoLados = entrada.nextDouble();
//        double area = (quantidadeLados * (comprimentoLados * comprimentoLados)) / (4 * Math.tan(Math.PI / quantidadeLados));
//        System.out.println("Area do Poligono: " + area);

        //36
        
    }

    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
