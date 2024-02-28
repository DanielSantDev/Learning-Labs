    /**
     *  Abstract Factory Method
     *
     *  O Abstract Factory é projetado para criar famílias de objetos relacionados ou dependentes, sem especificar suas classes concretas.
     *  É usado quando você precisa garantir que os objetos criados sejam compatíveis e pertençam a famílias específicas de classes.
     *
     *  Componentes Principais:
     *
     *  AbstractProduct (Produto Abstrato): Interface ou classe abstrata que define o tipo de objeto a ser criado. (Carro, Motor, Carroceria)
     *  ConcreteProduct (Produto Concreto): Implementação concreta do produto. (CarroPopular, MotorComum e CarroceriaSimples)
     *  AbstractFactory (Fábrica Abstrata): Interface ou classe abstrata que declara métodos para criar produtos. (FabricaDeCarro)
     *  ConcreteFactory (Fábrica Concreta): Implementação concreta da fábrica, que cria produtos de uma família específica. (FabricaCarroPopular)
     *
     */

    public class Cliente {
        public static void main(String[] args) {
            // Utilizando a fábrica de carros populares
            FabricaDeCarro fabricaCarroPopular = new FabricaCarroPopular();

            Carro carro = fabricaCarroPopular.criarCarro();
            Motor motor = fabricaCarroPopular.criarMotor();
            Carroceria carroceria = fabricaCarroPopular.criarCarroceria();

            // Exibindo informações dos produtos
            carro.exibirInfo();
            motor.ligar();
            carroceria.construir();
        }
    }