import java.util.ArrayList;
import java.util.List;
public class Listas {
    public static void main(String[] args) {
        // Criando uma instância de ArrayList para armazenar strings
        List<String> listaDeNomes = new ArrayList<>();

        // Adicionando elementos à lista
        listaDeNomes.add("Alice");
        listaDeNomes.add("Bob");
        listaDeNomes.add("Charlie");
        listaDeNomes.add("David");

        // Exibindo a lista original
        System.out.println("Lista original: " + listaDeNomes);

        // Acessando elementos por índice
        String primeiroNome = listaDeNomes.get(0);
        System.out.println("Primeiro nome: " + primeiroNome);

        // Modificando um elemento
        listaDeNomes.set(2, "Carlos");
        System.out.println("Lista após modificar um elemento: " + listaDeNomes);

        // Verificando se a lista contém um elemento específico
        boolean contemBob = listaDeNomes.contains("Bob");
        System.out.println("A lista contém Bob? " + contemBob);

        // Obtendo o tamanho da lista
        int tamanhoDaLista = listaDeNomes.size();
        System.out.println("Tamanho da lista: " + tamanhoDaLista);

        // Removendo um elemento
        listaDeNomes.remove("David");
        System.out.println("Lista após remover David: " + listaDeNomes);

        // Iterando sobre a lista usando um loop for each
        System.out.println("Iterando sobre a lista:");
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }

        // Convertendo a lista para um array
        String[] arrayDeNomes = listaDeNomes.toArray(new String[0]);
        System.out.println("Array resultante: " + java.util.Arrays.toString(arrayDeNomes));
    }
}
