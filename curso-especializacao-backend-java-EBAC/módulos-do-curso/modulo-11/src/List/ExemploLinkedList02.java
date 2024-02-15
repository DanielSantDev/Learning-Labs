package List;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Daniel Santana
 */

public class ExemploLinkedList02 {

    public static void main(String[] args) {
        // Criando uma LinkedList de String
        List<String> listaDeNomes = new LinkedList<>();

        // Adicionando elementos
        listaDeNomes.add("Alice");
        listaDeNomes.add("Bob");
        listaDeNomes.add("Charlie");

        // Acessando elementos por índice (menos eficiente)
        String primeiroNome = listaDeNomes.get(0);
        System.out.println("Primeiro nome: " + primeiroNome);

        // Iterando sobre a lista
        System.out.println("Lista de nomes:");
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }

        // Removendo um elemento (mais eficiente)
        listaDeNomes.remove("Bob");

        // Verificando se um elemento está na lista
        boolean contemCharlie = listaDeNomes.contains("Charlie");
        System.out.println("Contém Charlie? " + contemCharlie);
    }
}