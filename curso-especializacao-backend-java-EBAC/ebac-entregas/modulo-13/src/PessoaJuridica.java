public class PessoaJuridica extends Pessoa{
    private int cnpj;
    private String tipo="Pessoa Juridica";

    public PessoaJuridica(String nome, String sobrenome, String endereco, String cep, String estado, int idade,
                          int cnpj) {
        super(nome, sobrenome, endereco, cep, estado, idade);
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
