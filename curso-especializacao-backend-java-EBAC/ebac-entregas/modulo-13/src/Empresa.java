public class Empresa {

    public static void main(String[] args) {
        System.out.println("CADASTRO DE NOVOS FUNCIONARIOS.");
        PessoaFisica Daniel = new PessoaFisica("Daniel","Santos","Rua Brasil 123",
                "12345678", "SP", 24, 123456789,123456789);
        PessoaJuridica Matheus = new PessoaJuridica("Matheus", "Santana", "Rua Santista 147",
                "87654321", "RJ", 35,123456789);

        System.out.println("Funcionarios na Empresa:");
        imprimir(Daniel);
        imprimir(Matheus);
    }

    public static void imprimir(Pessoa tipoPessoa){
        tipoPessoa.imprimirInfos();
    }
}
