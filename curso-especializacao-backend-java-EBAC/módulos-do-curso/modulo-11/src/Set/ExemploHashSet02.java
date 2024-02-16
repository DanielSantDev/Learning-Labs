package Set;
import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet02 {
    public static void main(String[] args) {
        // Criando uma instância de HashSet para representar um conjunto de números inteiros
        Set<Integer> conjuntoDeNumeros = new HashSet<>();

        // Adicionando elementos ao conjunto
        conjuntoDeNumeros.add(10);
        conjuntoDeNumeros.add(20);
        conjuntoDeNumeros.add(30);
        conjuntoDeNumeros.add(40);
        conjuntoDeNumeros.add(20);  // Não permitirá elementos duplicados

        // Exibindo o conjunto original
        System.out.println("Conjunto original: " + conjuntoDeNumeros);

        // Verificando se o conjunto contém um elemento específico
        boolean contemTrinta = conjuntoDeNumeros.contains(30);
        System.out.println("O conjunto contém 30? " + contemTrinta);

        // Removendo um elemento do conjunto
        conjuntoDeNumeros.remove(20);
        System.out.println("Conjunto após remover 20: " + conjuntoDeNumeros);

        // Obtendo o tamanho do conjunto
        int tamanhoDoConjunto = conjuntoDeNumeros.size();
        System.out.println("Tamanho do conjunto: " + tamanhoDoConjunto);

        // Iterando sobre o conjunto usando um loop for each
        System.out.println("Iterando sobre o conjunto:");
        for (Integer numero : conjuntoDeNumeros) {
            System.out.println(numero);
        }

        // Limpando o conjunto
        conjuntoDeNumeros.clear();
        System.out.println("Conjunto após limpar: " + conjuntoDeNumeros);
    }
}
