public class FatorialBottomUp {
    public static long fatorial(int n) {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fatorial(3));
        System.out.println(fatorial(7));
        System.out.println(fatorial(100));
    }
}
