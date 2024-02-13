import java.util.LinkedList;
import java.util.Queue;

public class Queue {
    public static void main(String[] args) {
        // Criando uma instância de LinkedList para representar uma fila
        Queue<String> filaDeClientes = new LinkedList<>();

        // Adicionando elementos à fila
        filaDeClientes.offer("Cliente 1");
        filaDeClientes.offer("Cliente 2");
        filaDeClientes.offer("Cliente 3");

        // Exibindo a fila original
        System.out.println("Fila original: " + filaDeClientes);

        // Obtendo e removendo o elemento na frente da fila (poll)
        String clienteAtual = filaDeClientes.poll();
        System.out.println("Cliente atendido: " + clienteAtual);

        // Exibindo a fila após o atendimento
        System.out.println("Fila após atendimento: " + filaDeClientes);

        // Obtendo, mas não removendo, o elemento na frente da fila (peek)
        String proximoCliente = filaDeClientes.peek();
        System.out.println("Próximo cliente na fila: " + proximoCliente);

        // Exibindo a fila novamente
        System.out.println("Fila atualizada: " + filaDeClientes);

        // Adicionando mais clientes à fila
        filaDeClientes.offer("Novo Cliente 1");
        filaDeClientes.offer("Novo Cliente 2");

        // Exibindo a fila após adicionar mais clientes
        System.out.println("Fila atualizada: " + filaDeClientes);

        // Iterando sobre a fila usando um loop while
        System.out.println("Iterando sobre a fila:");
        while (!filaDeClientes.isEmpty()) {
            String cliente = filaDeClientes.poll();
            System.out.println("Atendendo o cliente: " + cliente);
        }

        // Exibindo a fila após atender todos os clientes
        System.out.println("Fila final: " + filaDeClientes);
    }
}
