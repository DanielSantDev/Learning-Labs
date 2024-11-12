// Desenvolvido por DanielSantDev
// Uma pilha é uma estrutura de dados do tipo LIFO (Last In, First Out), onde o último elemento inserido é o primeiro a ser removido.
// Operações comuns em pilhas incluem "push" (inserir no topo), "pop" (remover do topo) e "peek" (visualizar o topo).

public class Stack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Topo da pilha: " + stack.peek());
        System.out.println("Tamanho da pilha: " + stack.size());

        System.out.println("Elemento removido: " + stack.pop());
        System.out.println("Novo topo da pilha: " + stack.peek());
        System.out.println("Pilha está vazia? " + stack.isEmpty());
    }
}