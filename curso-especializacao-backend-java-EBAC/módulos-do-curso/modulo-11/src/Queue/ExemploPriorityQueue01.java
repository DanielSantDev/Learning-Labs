package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Daniel Santana
 *
 * Ordenação por Prioridade
 * Implementação de Heap (implementada como uma heap binária)
 * Comparadores: Comparable
 * Operações Básicas: Offer, poll, peek
 * Complexidade de Tempo: As operações de inserção e remoção em uma PriorityQueue têm complexidade de tempo logarítmica,
 * tornando-as eficientes, especialmente para grandes conjuntos de dados.
 *
 *
 */

public class ExemploPriorityQueue01 {
    public static void main(String args[]) {
        //Ordenação Natural
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");
        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }
    }
}
