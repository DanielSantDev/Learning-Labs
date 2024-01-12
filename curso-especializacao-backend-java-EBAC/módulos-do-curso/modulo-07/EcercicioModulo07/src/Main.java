public class Main {

    /**
     * @author Daniel Santana
     * @param args
     *
     * Modificador private: Acesso restrito à própria classe
     * Método público: Pode ser acessado por qualquer classe
     * Modificador private: Acesso restrito à própria classe
     *
     */

    public static void main(String[] args) {

        Carro Carro1 = new Carro();

        Carro1.setModelo("Fiat Uno");
        Carro1.setCor("Vermelho");
        Carro1.setAno(2018);

        System.out.println("Carro: " + Carro1.getModelo());
        System.out.println("Cor: " + Carro1.getCor());
        System.out.println("Ano: " + Carro1.getAno());

    }

}
