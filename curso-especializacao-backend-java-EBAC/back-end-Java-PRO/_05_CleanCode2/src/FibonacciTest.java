import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testFibonacciBaseCases() {
        assertEquals(0, Fibonacci.fibonacci(0), "Fibonacci de 0 deve ser 0");
        assertEquals(1, Fibonacci.fibonacci(1), "Fibonacci de 1 deve ser 1");
    }

    @Test
    public void testFibonacciGeneralCases() {
        assertEquals(1, Fibonacci.fibonacci(2), "Fibonacci de 2 deve ser 1");
        assertEquals(2, Fibonacci.fibonacci(3), "Fibonacci de 3 deve ser 2");
        assertEquals(3, Fibonacci.fibonacci(4), "Fibonacci de 4 deve ser 3");
        assertEquals(5, Fibonacci.fibonacci(5), "Fibonacci de 5 deve ser 5");
        assertEquals(8, Fibonacci.fibonacci(6), "Fibonacci de 6 deve ser 8");
        assertEquals(13, Fibonacci.fibonacci(7), "Fibonacci de 7 deve ser 13");
    }

    @Test
    public void testFibonacciLargerNumbers() {
        assertEquals(21, Fibonacci.fibonacci(8), "Fibonacci de 8 deve ser 21");
        assertEquals(34, Fibonacci.fibonacci(9), "Fibonacci de 9 deve ser 34");
        assertEquals(55, Fibonacci.fibonacci(10), "Fibonacci de 10 deve ser 55");
    }

    @Test
    public void testFibonacciNegativeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fibonacci(-1);
        });
        assertEquals("O índice não pode ser negativo.", exception.getMessage());
    }
}
