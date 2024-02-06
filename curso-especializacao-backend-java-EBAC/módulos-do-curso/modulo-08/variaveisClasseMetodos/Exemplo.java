public class Exemplo {

    // Variável de instância
    private int contador;

    // Método que usa a variável de instância
    public void incrementarContador() {
        contador++;
    }

    // Método que usa uma variável local
    public void exemploMetodo() {
        int x = 10; // Variável local
        System.out.println(x);
    }

    // Método com parâmetro
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    // Variável de classe
    private static int contadorGlobal;

    // Método que usa a variável de classe
    public void incrementarContadorGlobal() {
        contadorGlobal++;
    }
}