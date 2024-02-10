public class DoWhile{
    public static void main(String[] args) {
        int a=1, b=0;
        do {
            for (int i=0; i <= 10 ; i++){
                System.out.println(a + " X " + i + " = " + (b * a));
                b += 1;
            }
            b = 0;
            a += 1;
            System.out.println("\n");
        } while (a <= 10);
    }
}