public class While{
    public static void main(String[] args) {
        int a=1, b=0;

        while ( a <= 10 ) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(a + " X " + i + " = " + (b * a));
                b += 1;
            }
            b = 0;
            a += 1;
            System.out.println("\n");
        }
    }
}