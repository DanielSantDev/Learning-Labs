public class Main {

    public static void main(String[] args) {
        // Variáveis int (inteiro)
        int idade = 25;
        System.out.println("Idade: " + idade);

        // Variáveis double (ponto flutuante)
        double altura = 1.75;
        System.out.println("Altura: " + altura);

        // Variáveis char (caractere)
        char genero = 'M';
        System.out.println("Gênero: " + genero);

        // Variáveis boolean (booleano)
        boolean estudante = true;
        System.out.println("É estudante? " + estudante);

        // Variáveis String (sequência de caracteres)
        String nome = "João";
        System.out.println("Nome: " + nome);

        // Variáveis byte (inteiro de 8 bits)
        byte idadeByte = 30;
        System.out.println("Idade em byte: " + idadeByte);

        // Variáveis short (inteiro de 16 bits)
        short temperatura = -10;
        System.out.println("Temperatura: " + temperatura);

        // Variáveis long (inteiro de 64 bits)
        long populacaoMundial = 7800000000L;
        System.out.println("População mundial: " + populacaoMundial);

        // Variáveis float (ponto flutuante de 32 bits)
        float preco = 49.99f;
        System.out.println("Preço: " + preco);

        // Variáveis array (vetor)
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Números: " + java.util.Arrays.toString(numeros));

        // Variáveis objeto (classe)
        java.util.Date dataAtual = new java.util.Date();
        System.out.println("Data atual: " + dataAtual);
    }
}
