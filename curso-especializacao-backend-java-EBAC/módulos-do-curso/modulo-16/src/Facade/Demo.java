package Facade;

public class Demo {

    public static void main(String args[]) {
        IApartamentoService service = new ApartamentoService();
        service.cadastarApartamento(new Apartamento(1L, "Endereco"));
    }
}