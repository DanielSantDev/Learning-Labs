import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
//        //1
//        System.out.println("Hello");
//        System.out.println("Daniel Santana\n");
//
//        //2
//        System.out.println(74 + 36);
//
//        //3
//        System.out.println(50 / 3);
//
//        //4
//        int a = (-5 + 8 * 6);
//        float b = ((55 + 9) % 9);
//        float c = (20+ -3 * 5 / 8);
//        float d = (5 + 15 / 3 * 2 -8 % 3);
//        System.out.println("\nA: " + a + "\nB: " + b + "\nC: " + c + "\nD: " + d);
//
//        //5
        Scanner entrada = new Scanner(System.in);
//        float p = entrada.nextFloat();
//        float s = entrada.nextFloat();
//        System.out.println("Produto: " + p * s);
//
//        //6
//        float num1 = entrada.nextFloat();
//        float num2 = entrada.nextFloat();
//        System.out.println("\nOs dois numeros sao:" + num1 + " e " + num2);
//        System.out.println("Adicao: " + (num1 + num2));
//        System.out.println("Subtracao: " + (num1 - num2));
//        System.out.println("Multiplicação: " + num1 * num2);
//        System.out.println("Divisao: " + num1 / num2);
//        System.out.println("Resto: " + num1 % num2);
//
//        //7
//        int numero = entrada.nextInt();
//        for(int i=1 ; i <= 10 ; i++){
//            System.out.println(numero + " * " + i + " = " + (numero * i));
//        }

//        //8
//        System.out.println("   J    a   v     v  a    ");
//        System.out.println("   J   a a   v   v  a a   ");
//        System.out.println("J  J  aaaaa   V V  aaaaa  ");
//        System.out.println(" JJ  a     a   V  a     a ");
//
//        //9
//        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
//
//        //10
//        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
//
//        //11
//        final float PI = 3.1416f;
//        float raio = entrada.nextFloat();
//        System.out.println("O perimetro do circulo: " + ((PI * 2) * raio));
//        System.out.println("A area do circulo: " + (PI * (raio*raio)));

//        //12
//        int n1 = entrada.nextInt();
//        int n2 = entrada.nextInt();
//        int n3 = entrada.nextInt();
//        System.out.println("Media = " + ((n1 + n2 + n3) / 3) );

        //13
//        float base = entrada.nextFloat();
//        float altura = entrada.nextFloat();
//        System.out.println("O perimetro do retangulo: " + (2 * (base + altura)) );
//        System.out.println("A area do retangulo: " + (base * altura) );

//        //14
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");

        //15
//        int var1 = 10;
//        int var2 = 20;
//        System.out.println("Antes.\nVariavel 1: " + var1 + " Variavel 2: " + var2);
//        var1 = var1 + var2;
//        var2 = var1 - var2;
//        var1 = var1 - var2;
//        System.out.println("\nDepois.\nVariavel 1: " + var1 + " Variavel 2: " + var2);

//        //16
//        System.out.println(" +\"\"\"\"\"+ ");
//        System.out.println("[| o o |]");
//        System.out.println(" |  ^  | ");
//        System.out.println(" | '-' | ");
//        System.out.println(" +-----+");

//        //17
//        long binario1, binario2;
//        int i = 0, resto = 0;
//
//        int[] sum = new int[20];
//        binario1 = entrada.nextLong();
//        binario2 = entrada.nextLong();
//
//        while (binario1 != 0 || binario2 != 0)
//        {
//            // Calculate the sum of binary digits and update the remainder
//            sum[i++] = (int)((binario1 % 10 + binario2 % 10 + resto) % 2);
//            resto = (int)((binario1 % 10 + binario2 % 10 + resto) / 2);
//            binario1 = binario1 / 10;
//            binario2 = binario2 / 10;
//        }
//
//        if (resto != 0) {
//            sum[i++] = resto;
//        }
//
//        i--;
//
//        System.out.println("Soma dos numeros binarios: ");
//        while (i >= 0) {
//            System.out.print(sum[i--]);
//        }

//        //18
//        long b1, b2, produto = 0;
//        int digit, factor = 1;
//        b1 = entrada.nextLong();
//        b2 = entrada.nextLong();
//        while (b2 != 0) {
//            digit = (int)(b2 % 10);
//            if (digit == 1) {
//                b1 = b1 * factor;
//                produto = binaryproduct((int) b1, (int) produto);
//            } else {
//                b1 = b1 * factor;
//            }
//            b2 = b2 / 10;
//            factor = 10;
//        }
//        System.out.println("Produto de dois numeros: " + produto);

//        //19
//        int dec_num, quot, i = 1, j;
//        int bin_num[] = new int[100];
//        Scanner scan = new Scanner(System.in);
//
//        dec_num = scan.nextInt();
//        quot = dec_num;
//
//        while (quot != 0) {
//            bin_num[i++] = quot % 2;
//            quot = quot / 2;
//        }
//
//        System.out.print("Binary number is: ");
//        for (j = i - 1; j > 0; j--) {
//            System.out.print(bin_num[j]);
//        }

//        //20
//        int rem;
//        String hexdec_num = "";
//        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//
//        int dec_num = entrada.nextInt();
//
//        while (dec_num > 0) {
//            rem = dec_num % 16;
//            hexdec_num = hex[rem] + hexdec_num;
//            dec_num = dec_num / 16;
//        }
//
//        System.out.print("Hexadecimal number is: " + hexdec_num + "\n");

//        //21
//        int dec_num, quot, i = 1, j;
//        int oct_num[] = new int[100];
//        dec_num = entrada.nextInt();
//        quot = dec_num;
//
//        while (quot != 0) {
//            oct_num[i++] = quot % 8;
//            quot = quot / 8;
//        }
//
//        System.out.print("Octal number is: ");
//        for (j = i - 1; j > 0; j--) {
//            System.out.print(oct_num[j]);
//        }

        //22
//        Scanner sc = new Scanner(System.in);
//        long binaryNumber, decimalNumber = 0, j = 1, remainder;
//        binaryNumber = sc.nextLong();
//
//        while (binaryNumber != 0) {
//            remainder = binaryNumber % 10;
//            decimalNumber = decimalNumber + remainder * j;
//            j = j * 2;
//            binaryNumber = binaryNumber / 10;
//        }
//
//        System.out.println("Decimal Number: " + decimalNumber);

//        //23
//        int[] hex = new int[1000];
//        int i = 1, j = 0, rem, dec = 0, bin;
//
//        bin = entrada.nextInt();
//
//        while (bin > 0) {
//            rem = bin % 2;
//            dec = dec + rem * i;
//            i = i * 2;
//            bin = bin / 10;
//        }
//        i = 0;
//
//        while (dec != 0) {
//            hex[i] = dec % 16;
//            dec = dec / 16;
//            i++;
//        }
//
//        for (j = i - 1; j >= 0; j--) {
//            if (hex[j] > 9) {
//                System.out.print((char)(hex[j] + 55));
//            } else {
//                System.out.print(hex[j]);
//            }
//        }

//        //24
//        int binnum, binnum1, rem, decnum = 0, quot, i = 1, j;
//        int octnum[] = new int[100];
//        binnum = entrada.nextInt();
//        binnum1 = binnum;
//
//        while (binnum > 0) {
//            rem = binnum % 10;
//            decnum = decnum + rem * i;
//            i = i * 2;
//            binnum = binnum / 10;
//        }
//
//        i = 1;
//        quot = decnum;
//
//        while (quot > 0) {
//            octnum[i++] = quot % 8;
//            quot = quot / 8;
//        }
//
//        System.out.print("Equivalent Octal Value of " + binnum1 + " is :");
//        for (j = i - 1; j > 0; j--) {
//            System.out.print(octnum[j]);
//        }

//        //25
//        long octal_num, decimal_num = 0;
//        int i = 0;
//        System.out.print("Input any octal number: ");
//        octal_num = entrada.nextLong();
//        while (octal_num != 0) {
//            decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
//            octal_num = octal_num / 10;
//        }
//        System.out.print("Equivalent decimal number: " + decimal_num + "\n");

//        //26
//        int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
//        long octal_num, tempoctal_num, binary_num, place;
//        int rem;
//        System.out.print("Input any octal number: ");
//        octal_num = entrada.nextLong();
//        tempoctal_num = octal_num;
//        binary_num = 0;
//        place = 1;
//
//        while (tempoctal_num != 0) {
//            rem = (int)(tempoctal_num % 10);
//            binary_num = octal_numvalues[rem] * place + binary_num;
//            tempoctal_num /= 10;
//            place *= 1000;
//        }
//
//        System.out.print("Equivalent binary number: " + binary_num + "\n");

//        //27
//        String octal_num, hex_num;
//        int decnum;
//        System.out.print("Input an octal number : ");
//        octal_num = entrada.nextLine();
//        decnum = Integer.parseInt(octal_num, 8);
//        hex_num = Integer.toHexString(decnum);
//        System.out.print("Equivalent hexadecimal number: " + hex_num + "\n");

//        //28
//        String hexdec_num;
//        int dec_num;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Input a hexadecimal number: ");
//        hexdec_num = scan.nextLine();
//        dec_num = hex_to_decimal(hexdec_num);
//        System.out.print("Equivalent decimal number is: " + dec_num + "\n");

//        //29
//        String hexdec_num;
//        int dec_num, i = 1, j;
//        int bin_num[] = new int[100];
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter Hexadecimal Number : ");
//        hexdec_num = scan.nextLine();
//        dec_num = hex_to_binary(hexdec_num);
//
//        while (dec_num != 0) {
//            bin_num[i++] = dec_num % 2;
//            dec_num = dec_num / 2;
//        }
//
//        System.out.print("Equivalent Binary Number is: ");
//        for (j = i - 1; j > 0; j--) {
//            System.out.print(bin_num[j]);
//        }

        //30
        String hexdec_num;
        int dec_num, i = 1, j;
        int octal_num[] = new int[100];
        Scanner in = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        hexdec_num = in.nextLine();
        dec_num = hex_to_oct(hexdec_num);

        while (dec_num != 0) {
            octal_num[i++] = dec_num % 8;
            dec_num = dec_num / 8;
        }

        System.out.print("Equivalent of octal number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(octal_num[j]);
        }

    }

    public static int hex_to_oct(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static int hex_to_binary(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }

        return val;
    }

    public static int hex_to_decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }

        return val;
    }

    static int binaryproduct(int binary1, int binary2) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (remainder != 0) {
            sum[i++] = remainder;
        }

        --i;

        while (i >= 0) {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }

        return binary_prod_result;
    }

}