public class Wrappers {
    public static void main(String[] args) {

        //declaração
        Integer num1 = Integer.valueOf(10);
        Double num2 = Double.valueOf(20202);
        Long num3 = Long.valueOf(5644558);
        Character letter = Character.valueOf('D');
        Boolean verdadeiro = Boolean.valueOf(true);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(letter);
        System.out.println(verdadeiro);

        //conversao para primitivo
        int Num1 = num1.intValue();
        double Num2 = num2.doubleValue();
        long Num3 = num3.longValue();
        char Letter = letter.charValue();
        boolean Verdadeiro = verdadeiro.booleanValue();

        System.out.println("\n" + Num1);
        System.out.println(Num2);
        System.out.println(Num3);
        System.out.println(Letter);
        System.out.println(Verdadeiro);
    }
}