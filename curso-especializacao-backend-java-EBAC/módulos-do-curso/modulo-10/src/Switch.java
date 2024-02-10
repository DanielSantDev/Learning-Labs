import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        System.out.println("MENU INTERATIVO - ESCOLHA SEU NUMERO (1 AO 5):");
        System.out.println("1 - X-Burguer");
        System.out.println("2 - X-Salada");
        System.out.println("3 - X-Calabresa");
        System.out.println("4 - X-Completao");
        System.out.println("5 - X-Picanha");
        System.out.println("0 - SAIR DO MENU");

        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();

        switch ( opcao ){
            case 0:
                System.out.println("\nVoce optou por SAIR do MENU !");
                break;
            case 1:
                System.out.println("\nVoce escolheu o X-Burguer !\nPreco: R$12,00");
                break;
            case 2:
                System.out.println("\nVoce escolheu o X-Salada !\nPreco: R$14,00");
                break;
            case 3:
                System.out.println("\nVoce escolheu o X-Calabresa !\nPreco: R$16,00");
                break;
            case 4:
                System.out.println("\nVoce escolheu o X-Completao !\nPreco: R$20,00");
                break;
            case 5:
                System.out.println("\nVoce escolheu o X-Picanha !\nPreco: R$35,00");
                break;
            default:
                System.out.println("\nVALOR INVALIDO !");
                break;
        }
        System.out.println("\nMuito Obrigado pela preferencia !\n");
    }
}