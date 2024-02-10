public class Casting {
    public static void main(String[] args) {
        System.out.println("Casting");
        int num1 = 654;
        System.out.println(num1);
        double x = num1;
        System.out.println(x);

        System.out.println("\nDowncasting");
        double num2 = 245.45;
        System.out.println(num2);
        int y = (int) num2;
        System.out.println(y);
    }
}