package Set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Daniel Santana
 * LinkedHashSet é uma variação do HashSet que mantém a ordem de inserção dos elementos.
 * Não permite elementos duplicados, assim como o HashSet.
 * Um pouco mais lento que o HashSet, mas ainda eficiente para operações de adição,
 * remoção e verificação de pertencimento.
 * Mantém a ordem de inserção dos elementos.
 *
 * Útil quando a ordem de inserção dos elementos é importante
 * e você também deseja benefícios de desempenho semelhantes ao HashSet.
 */

public class ExemploLinkedHashSet {
    public static void main(String args[]) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Set<String> lista = new LinkedHashSet<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }
}
