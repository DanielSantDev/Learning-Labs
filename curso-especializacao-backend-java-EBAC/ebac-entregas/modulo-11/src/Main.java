import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> ListaNomes = new ArrayList<String>();

        int opc = 1;

        do {
            System.out.println("\nMENU INTERATIVO XD\nDIGITE 0 PARA SAIR;" +
                    "\nDIGITE 1 PARA CONTINUAR;");
            opc = entrada.nextInt();
            entrada.nextLine();
            if (opc == 1) {
                System.out.println("Digite um nome: ");
                String nome = entrada.nextLine();
                ListaNomes.add(nome);
            } else {
                System.out.println("ENTRADA INVALIDA, TENTE NOVAMENTE\n");
            }
        } while (opc == 1);

        Collections.sort(ListaNomes);
        System.out.println("\nLista de Nomes: " + ListaNomes);
    }
}