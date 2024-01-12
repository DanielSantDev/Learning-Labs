public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.cadastrarEndereco("Rua 1");
        cliente1.setCodigo(1);

        System.out.println(cliente1.getCodigo());
        System.out.println(cliente1.getEndereco());
        System.out.println(cliente1.retornarNomeCliente());

    }
}