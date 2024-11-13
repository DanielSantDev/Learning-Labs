import java.util.ArrayList;
import java.util.List;

public class TrocoGuloso {
    public static List<Integer> calcularTroco(int quantia, int[] moedas) {
        List<Integer> resultado = new ArrayList<>();

        java.util.Arrays.sort(moedas);
        for (int i = moedas.length - 1; i >= 0; i--) {
            while (quantia >= moedas[i]) {
                quantia -= moedas[i];
                resultado.add(moedas[i]);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] moedas = {5, 2, 1};
        int quantia = 18;
        List<Integer> troco = calcularTroco(quantia, moedas);

        System.out.println("Quantidade mínima de moedas para o troco de " + quantia + ": " + troco.size());
        System.out.println("Moedas usadas: " + troco);
    }
}
