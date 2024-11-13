/**
 * A classe Calculadora fornece métodos para realizar operações aritméticas básicas
 * de adição, subtração, multiplicação e divisão com dois inteiros.
 */
public class CalculadoraDocumentada {

    /**
     * Adiciona dois inteiros.
     *
     * @param a o primeiro inteiro
     * @param b o segundo inteiro
     * @return a soma de a e b
     */
    private int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo inteiro do primeiro.
     *
     * @param a o primeiro inteiro
     * @param b o segundo inteiro
     * @return o resultado da subtração de b de a
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois inteiros.
     *
     * @param a o primeiro inteiro
     * @param b o segundo inteiro
     * @return o produto de a e b
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro inteiro pelo segundo.
     *
     * @param a o dividendo
     * @param b o divisor (deve ser diferente de zero)
     * @return o quociente de a dividido por b
     * @throws ArithmeticException se b for zero
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
