public class Fibonacci {
    public static int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("O índice não pode ser negativo.");
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}