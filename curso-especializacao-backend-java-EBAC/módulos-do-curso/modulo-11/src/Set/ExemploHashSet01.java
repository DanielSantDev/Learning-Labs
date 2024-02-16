package Set;

import java.util.Set;
import java.util.HashSet;

/**
 * @author Daniel Santana
 * HashSet é uma implementação de conjunto que armazena elementos em uma tabela de hash.
 * Isso significa que não garante uma ordem específica dos elementos.
 * O acesso aos dados é mais rápido que em um TreeSet, mas nada garante que os dados estaram ordenados.
 * Sem duplicatas. Não repete valores na lista
 *
 * Recomendado quando a ordem dos elementos não é importante e o objetivo é otimizar operações de busca.
 *
 */

public class ExemploHashSet01 {
    public static void main(String args[]) {
        exemploNovo();
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploNovo() {
        System.out.println("****** exemploNovo ******");
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(4);
        System.out.println(inteiros);
    }

    private static void exemploListaSimples() {
        System.out.println("\n****** exemploListaSimples ******");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        Set<String> lista = new HashSet<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        //Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
