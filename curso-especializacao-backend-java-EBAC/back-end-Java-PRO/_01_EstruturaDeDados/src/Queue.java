// Desenvolvido por DanielSantDev
// Uma fila é uma estrutura de dados do tipo FIFO (First In, First Out), onde o primeiro elemento inserido é o primeiro a ser removido.

public class Queue {
    private Node front;
    private Node rear;
    private int size;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia");
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia");
        }
        return front.data;
    }

    public int rear() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia");
        }
        return rear.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Frente da fila: " + queue.front());
        System.out.println("Fim da fila: " + queue.rear());
        System.out.println("Tamanho da fila: " + queue.size());

        System.out.println("Elemento removido: " + queue.dequeue());
        System.out.println("Nova frente da fila: " + queue.front());
        System.out.println("Fila está vazia? " + queue.isEmpty());
    }
}
