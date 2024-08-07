import java.util.Scanner;

public class part2 {

    public static void main(String[] args) {

//        //31
//        System.out.println("JAVA VERSION: " + System.getProperty("java.version"));
//        System.out.println("JRE VERSION: " + System.getProperty("java.runtime.version"));
//        System.out.println("JAVA HOME: " + System.getProperty("java.home"));
//        System.out.println("JAVA VENDOR: " + System.getProperty("java.vendor"));
//        System.out.println("JAVA VENDOR URL: " + System.getProperty("java.vendor.url"));
//        System.out.println("JAVA CLASS PATH: " + System.getProperty("java.class.path"));

//        //32
        Scanner entrada = new Scanner(System.in);
//        int int1 = entrada.nextInt();
//        int int2 = entrada.nextInt();
//
//        if (int1 == int2) {
//            System.out.println(int1 + " == " + int2);
//        }
//
//        if (int1 != int2){
//            System.out.println(int1 + " != " + int2);
//        }
//
//        if (int1 < int2){
//            System.out.println(int1 + " < " + int2);
//        }
//
//        if (int1 > int2){
//            System.out.println(int1 + " > " + int2);
//        }
//
//        if (int1 <= int2){
//            System.out.println(int1 + " <= " + int2);
//        }
//
//        if (int1 >= int2){
//            System.out.println(int1 + " >= " + int2);
//        }

//        //33
//        int x = entrada.nextInt();
//        String conversao = String.valueOf(x);
//
//        char primeiraPosicao = conversao.charAt(0);
//        char segundaPosicao = conversao.charAt(1);
//
//        int primeiroNumero = Integer.parseInt(String.valueOf(primeiraPosicao));
//        int segundoNumero = Integer.parseInt(String.valueOf(segundaPosicao));
//
//        System.out.println("Primeira posicao do numero digitado: " + primeiraPosicao);
//        System.out.println("Segunda posicao do numero digitado: " + segundaPosicao);
//        System.out.println("Soma das duas posicoes: " + (primeiroNumero + segundoNumero));
//
//        System.out.println("A soma dos numeros eh: " + sumDigits(x));

//        //34
//        final double PI = 3.1416d;
//        double lado = entrada.nextDouble();
//        double area = (6 * (lado * lado)) / (4 * Math.tan(PI / 6));
//        System.out.println("Area do Hexagono: " + area);

//        //35
//        double quantidadeLados = entrada.nextDouble();
//        double comprimentoLados = entrada.nextDouble();
//        double area = (quantidadeLados * (comprimentoLados * comprimentoLados)) / (4 * Math.tan(Math.PI / quantidadeLados));
//        System.out.println("Area do Poligono: " + area);

//        //36
//        double latitude1 = entrada.nextDouble();
//        double longitude1 = entrada.nextDouble();
//
//        double latitude2 = entrada.nextDouble();
//        double longitude2 = entrada.nextDouble();
//
//        System.out.println("A distancia entre os pontos é: " + distance_Between_LatLong(latitude1, longitude1, latitude2, longitude2));

//        //37
//        char[] texto = entrada.nextLine().toCharArray();
//
//        for (int i = texto.length - 1; i >= 0; i--) {
//            System.out.println(texto[i]);
//        }

//        //38
//        String test = "Daniel San 123456 d a ¨7&)(*";
//        count(test);

        //39
        int amount = 0; // Initialize a counter for three-digit numbers

        // Iterate through three nested loops to generate all unique three-digit numbers
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    // Check if 'i,' 'j,' and 'k' are all different (not equal)
                    if (k != i && k != j && i != j) {
                        amount++; // Increment the counter
                        System.out.println(i + "" + j + "" + k); // Print the generated three-digit number
                    }
                }
            }
        }

        // Display the total number of generated three-digit numbers
        System.out.println("Total number of the three-digit-number is " + amount);

    }

    public static void count(String x) {
        // Convert the input string to a character array
        char[] ch = x.toCharArray();

        // Initialize counters for letters, spaces, numbers, and other characters
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        // Iterate through the character array to categorize characters
        for (int i = 0; i < x.length(); i++) {
            // Check if the character is a letter
            if (Character.isLetter(ch[i])) {
                letter++;
            }
            // Check if the character is a digit (number)
            else if (Character.isDigit(ch[i])) {
                num++;
            }
            // Check if the character is a space
            else if (Character.isSpaceChar(ch[i])) {
                space++;
            }
            // Character falls into the "other" category if none of the above conditions are met
            else {
                other++;
            }
        }

        // Display the original string
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");

        // Display the counts of letters, spaces, numbers, and other characters
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }

    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthRadius = 6371.01;

        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }

}
