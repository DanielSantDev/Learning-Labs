import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros<T extends Carro> {

    /**
     * @author DanielSantDev
     *
     * A classe ListaDeCarros<T extends Carro> é um exemplo de Generics.
     * Ela é parametrizada com T, que é uma extensão da classe Carro.
     * Isso significa que a lista ListaDeCarros pode conter qualquer tipo de carro ou subtipo de Carro.
     *
     * A utilização de Generics nesse contexto permite que a classe ListaDeCarros seja flexível o suficiente para -
     * trabalhar com diferentes tipos de carros sem sacrificar a segurança de tipos.
     *
     */
    private List<T> listaDeCarros = new ArrayList<>();

    public void adicionarCarro(T carro) {
        listaDeCarros.add(carro);
    }

    public List<T> getListaDeCarros() {
        return listaDeCarros;
    }

    public static void main(String[] args) {
        ListaDeCarros<Carro> listaDeCarros = new ListaDeCarros<>();

        Carro honda1 = new Honda("Honda", "Civic");
        Carro honda2 = new Honda("Honda", "City");
        Carro chevrolet1 = new Chevrolet("Chevrolet", "Cruze");
        Carro chevrolet2 = new Chevrolet("Chevrolet", "Corsa");
        Carro nissan1 = new Nissan("Nissan", "Frontier");
        Carro nissan2 = new Nissan("Nissan", "Sentra");
        Carro toyota1 = new Toyota("Toyota", "Corolla");
        Carro toyota2 = new Toyota("Toyota", "Hilux ");

        listaDeCarros.adicionarCarro(honda1);
        listaDeCarros.adicionarCarro(honda2);
        listaDeCarros.adicionarCarro(chevrolet1);
        listaDeCarros.adicionarCarro(chevrolet2);
        listaDeCarros.adicionarCarro(toyota1);
        listaDeCarros.adicionarCarro(toyota2);
        listaDeCarros.adicionarCarro(nissan1);
        listaDeCarros.adicionarCarro(nissan2);

        List<Carro> carros = listaDeCarros.getListaDeCarros();
        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
}