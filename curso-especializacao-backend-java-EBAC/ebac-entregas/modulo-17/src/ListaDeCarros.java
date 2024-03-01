import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros<T extends Carro> {
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