package Set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Daniel Santana
 * TreeSet é uma implementação de conjunto que armazena elementos em uma árvore balanceada.
 * Os elementos são mantidos em ordem natural ou por meio de um comparador fornecido durante a criação.
 * Garante uma ordem específica dos elementos, seja pela ordem natural dos elementos ou pelo comparador fornecido.
 * Não permite elementos duplicados.
 * Um pouco mais lento que HashSet e LinkedHashSet, especialmente para operações de adição e remoção.
 *
 * Ideal quando a ordem dos elementos é importante, e você deseja garantir a ordenação natural ou personalizada.
 */

public class ExemploTreeSet {
    public static void main(String args[]) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Set<String> lista = new TreeSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }
}
