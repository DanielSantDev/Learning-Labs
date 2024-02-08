public class Operadores {

    public static void main(String[] args) {

        int x = 50;
        int y = 50;
        int z = 50;

        //Operadores Aritmeticos:
        System.out.println("Operadores Aritmeticos:");
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        //Operadores de Atribuicao:
        System.out.println("\nOperadores de Atribuicao:");
        //o sinal = indica atribuição
        z += x;
//        z = z + x;
        System.out.println("+=  "+ z);

        z = 50;
        z -= x;
//        z = z - x;
        System.out.println("-=  "+ z);

        z = 50;
        z *= x;
//        z = * x;
        System.out.println("*=  "+ z);

        z = 50;
        z /= x;
//        z = z / x;
        System.out.println("/=  "+ z);

        //Operadores de Comparação:
        z = 50;
        x = 25;
        System.out.println("\nOperadores de Comparacao:");
        System.out.println("X(25) eh________ de Z(50)");
        System.out.println("IGUAL?          "+ (x == z));
        System.out.println("DIFERENTE?      "+ (x != z));
        System.out.println("MENOR?          "+ (x < z));
        System.out.println("MAIOR?          "+ (x > z));
        System.out.println("MENOR OU IGUAL? "+ (x <= z));
        System.out.println("MAIOR OU IGUAL? "+ (x >= z));

        //Operadores Lógicos:
        z = 10;
        x = 20;
        y = 30;
        boolean a = true;
        System.out.println("\nOperadores Logicos:");
        System.out.println("AND: " + (x > z && x != y));
        System.out.println("OR: " + (x > z || x == y));
        System.out.println("NOT: " + !a);

        System.out.println("\nOperadores Bitwise:");
        x = 5;
        y = 3;
        int resultado = x & y;
        System.out.println("Resultado eh 1 (em binario: 0101 & 0011 = 0001)");

        System.out.println("\nOperador de incremento/decremento");
        x = 10;
        x++;
        y = 8;
        y--;
        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        System.out.println("\nOperador Ternario:");
        resultado = x > y ? x : y;
        System.out.println(resultado);

    }

}