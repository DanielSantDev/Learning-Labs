public class Calculadora {

    private int adicionar(int a, int b) {
        return a + b;
    }

    private int subtrair(int a, int b) {
        return a - b;
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    private int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    // Métodos getters para facilitar o teste dos métodos privados
    public int getAdicionar(int a, int b) {
        return adicionar(a, b);
    }

    public int getSubtrair(int a, int b) {
        return subtrair(a, b);
    }

    public int getMultiplicar(int a, int b) {
        return multiplicar(a, b);
    }

    public int getDividir(int a, int b) {
        return dividir(a, b);
    }
}
