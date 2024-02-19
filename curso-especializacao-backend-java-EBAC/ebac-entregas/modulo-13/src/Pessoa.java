public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private String endereco;
    private String cep;
    private String estado;
    private int idade;

    public Pessoa(String nome, String sobrenome, String endereco, String cep, String estado, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.cep = cep;
        this.estado = estado;
        this.idade = idade;
    }

    public void imprimirInfos(){
        System.out.println("\nNome: " + this.nome + " " +this.sobrenome +
        "\nEndereco: " + this.endereco + " - CEP: " + this.cep + " - Estado: " + this.estado + " - Idade: " + this.idade);
    }
}