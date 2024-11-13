import java.util.HashMap;
import java.util.Map;

public class FatorialTopDown {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long result = n * fatorial(n - 1);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fatorial(3));
        System.out.println(fatorial(7));
        System.out.println(fatorial(100));
    }
}
