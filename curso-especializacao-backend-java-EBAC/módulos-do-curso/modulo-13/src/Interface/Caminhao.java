package Interface;

public class Caminhao implements ICarro {
    @Override
    public void andar() {
        System.out.println("Carro está andando de vagar");
    }

    @Override
    public void parar() {
        System.out.println("Caminhão parando");
    }
}