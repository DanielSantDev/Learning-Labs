package br.com.daniel.pacote1;

public class Funcionario {

    public int getNumeroAcesso() {
        return numeroAcesso;
    }

    public void setNumeroAcesso(int numeroAcesso) {
        this.numeroAcesso = numeroAcesso;
    }

    private int numeroAcesso;
    public String nome;
    protected String endereco;

}