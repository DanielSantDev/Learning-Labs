public class PessoaFisica extends Pessoa{

    private int rg;
    private int cpf;
    private String tipo="Pessoa Fisica";

    public PessoaFisica(String nome, String sobrenome, String endereco, String cep, String estado, int idade, int rg, int cpf) {
        super(nome, sobrenome, endereco, cep, estado, idade);
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
