import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notas=0;
        for (int i=1; i<=4; i++) {
            System.out.println("Digite a sua nota " + i);
            notas += entrada.nextDouble();
        }

        double media = (notas / 4);
        System.out.println("\nSUA MEDIA EH: " + media + "\n");
        if (media >= 7) {
            System.out.println("Parabens ! Voce foi aprovado !");
        } else if (media >= 5 && media < 7) {
            System.out.println("Voce esta de recuperacao");
        } else {
            System.out.println("Infelizmente voce estah reprovado !");
        }
    }
}