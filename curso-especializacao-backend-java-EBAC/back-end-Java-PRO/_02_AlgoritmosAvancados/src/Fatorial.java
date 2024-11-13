public class Fatorial {
    public static long fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fatorial(3));
        System.out.println(fatorial(7));
        System.out.println(fatorial(100));
    }
}
