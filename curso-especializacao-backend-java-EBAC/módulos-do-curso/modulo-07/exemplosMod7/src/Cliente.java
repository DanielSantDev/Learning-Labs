public class Cliente {

    private int codigo;
    private String nome;
    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    /**
     * Method to set an address
     * @param endereco
     * @return
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Método para cadastrar endereco
     * @param endereco
     * @return endereco
     */
    public void cadastrarEndereco(String endereco) {
        setEndereco(endereco);
    }

    public void imprimirEndereco(){
        System.out.println(this.endereco);
    }

    public String retornarNomeCliente(){
        return "Endereco do Daniel";
    }

    public int getValorTotal(){
        return 30;
    }
}
