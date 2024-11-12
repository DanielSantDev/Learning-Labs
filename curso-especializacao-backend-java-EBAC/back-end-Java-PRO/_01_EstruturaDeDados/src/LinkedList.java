// Desenvolvido por DanielSantDev
// Uma lista encadeada é uma estrutura de dados onde cada elemento (nó) aponta para o próximo elemento da sequência.

public class LinkedList {
    private Node head;
    private int size;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public Node pop() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia");
        }

        if (head.next == null) {
            Node temp = head;
            head = null;
            size--;
            return temp;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = null;
        size--;
        return temp;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice fora do limite");
        }

        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fora do limite");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fora do limite");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(new Node(10));
        list.push(new Node(20));
        list.push(new Node(30));
        list.printList();

        list.insert(1, new Node(15));
        list.printList();

        System.out.println("Elemento no índice 2: " + list.elementAt(2).data);

        list.remove(1);
        list.printList();

        System.out.println("Elemento removido: " + list.pop().data);
        list.printList();

        System.out.println("Tamanho da lista: " + list.size());
    }
}
