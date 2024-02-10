public class BreakContinue {
    public static void main (String args []) {
        System.out.println("Utilizando break");
        for (int contador=1; contador<=1000; contador++){
            System.out.println("Esta eh a repeticao numero : "+contador);
            if (contador==10)
                break;
        }

        System.out.println("\nUtilizando continue");
        for (int contador=1; contador<=100; contador++){
            if (contador%5!=0)
                continue;
            System.out.println("Contador: "+contador);
        }
    }
}