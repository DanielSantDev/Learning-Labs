public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> clazz = Cliente.class;
        Tabela tabela = clazz.getAnnotation(Tabela.class);
        if (tabela != null) {
            String nomeTabela = tabela.nomeTabela();
            System.out.println("Nome da tabela: " + nomeTabela);
        }
    }
}