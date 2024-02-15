package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Daniel Santana *
 * Lista dinâmica que pode crescer ou encolher conforme necessário.
 * Eficiente para leitura e acesso direto aos elementos
 * Inserções e exclusões lentas.
 *
 *
 */

public class ExemploArrayList1 {

    public static void main(String args[]) {
        exemploNumeros();
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        IterandoValores();
    }

    private static void exemploNumeros() {
        System.out.println("****** exemploNumeros ******");
        //Interface<tipo> nomeVariavel = new Implementacao<>();
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        System.out.println(numeros+"\n");
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        //Interface<tipo> nomeVariavel = new Implementacao<>();
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        boolean contemNome = lista.contains("João da Silva");
        System.out.println("Contem João da Silva? " + contemNome);
        System.out.println(lista+"\n");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        //Interface<tipo> nomeVariavel = new Implementacao<>();
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("Marcio Ferraz");
        lista.add("Ancelotti Morrete");
        lista.add("Carlos Silva");
        lista.add("Barcos Santos");
        lista.remove("João da Silva");
        lista.remove(0);
        Collections.sort(lista);
        System.out.println(lista+"\n");
    }

    private static void IterandoValores() {
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("Marcio Ferraz");
        lista.add("Barcos Santos");
        for (String nome : lista) {
            System.out.println(nome);
        }
    }
}
