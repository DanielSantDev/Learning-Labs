import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> ListaHomen = new ArrayList<String>();
        List<String> ListaMulher = new ArrayList<String>();

        int opc = 0;
        int sexo = 0;

        do {
            System.out.println("\nMENU INTERATIVO XD\nDIGITE 0 PARA SAIR;" +
                    "\nDIGITE 1 PARA CONTINUAR;");
            opc = entrada.nextInt();
            entrada.nextLine();
            if (opc == 1){
                System.out.println("DIGITE 1 PARA SEXO MASCULINO\n" +
                        "DIGITE 2 PARA SEXO FEMININO");
                sexo = entrada.nextInt();
                entrada.nextLine();
                if (sexo == 1){
                    System.out.println("SEXO: MASCULINO");
                    System.out.println("Digite um nome: ");
                    String nome = entrada.nextLine();
                    ListaHomen.add(nome);
                } else if (sexo == 2){
                    System.out.println("SEXO: FEMININO");
                    System.out.println("Digite um nome: ");
                    String nome = entrada.nextLine();
                    ListaMulher.add(nome);
                } else {
                    System.out.println("ENTRADA INVALIDA, TENTE NOVAMENTE\n");
                }
            }
        } while (opc == 1);

        Collections.sort(ListaHomen);
        Collections.sort(ListaMulher);
        System.out.println("\nLista de nomes dos Homens: " + ListaHomen);
        System.out.println("\nLista de nomes dos Homens: " + ListaMulher);
    }
}