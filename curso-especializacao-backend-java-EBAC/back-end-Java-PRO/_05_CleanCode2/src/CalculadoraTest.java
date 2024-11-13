import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testeAdicionar() {
        assertEquals(5, calculadora.getAdicionar(2, 3), "2 + 3 deve ser 5");
        assertEquals(0, calculadora.getAdicionar(-2, 2), "-2 + 2 deve ser 0");
        assertEquals(-4, calculadora.getAdicionar(-2, -2), "-2 + -2 deve ser -4");
    }

    @Test
    public void testeSubtrair() {
        assertEquals(1, calculadora.getSubtrair(3, 2), "3 - 2 deve ser 1");
        assertEquals(-4, calculadora.getSubtrair(-2, 2), "-2 - 2 deve ser -4");
        assertEquals(0, calculadora.getSubtrair(2, 2), "2 - 2 deve ser 0");
    }

    @Test
    public void testeMultiplicar() {
        assertEquals(6, calculadora.getMultiplicar(2, 3), "2 * 3 deve ser 6");
        assertEquals(-4, calculadora.getMultiplicar(-2, 2), "-2 * 2 deve ser -4");
        assertEquals(4, calculadora.getMultiplicar(-2, -2), "-2 * -2 deve ser 4");
        assertEquals(0, calculadora.getMultiplicar(0, 5), "0 * 5 deve ser 0");
    }

    @Test
    public void testeDividir() {
        assertEquals(2, calculadora.getDividir(6, 3), "6 / 3 deve ser 2");
        assertEquals(-2, calculadora.getDividir(-6, 3), "-6 / 3 deve ser -2");
        assertEquals(1, calculadora.getDividir(5, 5), "5 / 5 deve ser 1");

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.getDividir(10, 0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}
