package br.com.rpires.reflections.anotacao.cadastro.fabrica;

public class Factory implements IFactory {

    @Override
    public FabricaPersistente criarFabrica(String opcaoMenuGeral) {
        if ("1".equals(opcaoMenuGeral)) {
            return new ClienteFabrica();
        } else {
            return new ProdutoFabrica();
        }
    }
}
