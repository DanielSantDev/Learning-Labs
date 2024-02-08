import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero inteiro:");
        int x = entrada.nextInt();
        System.out.println("Numero inserido: " + x);

        Integer y = x;
        System.out.println("Numero convertido para Integer: " + y);
    }
}