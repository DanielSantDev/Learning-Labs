public class FabricaCarroPopular implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new CarroPopular();
    }

    @Override
    public Motor criarMotor() {
        return new MotorComum();
    }

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaSimples();
    }
}