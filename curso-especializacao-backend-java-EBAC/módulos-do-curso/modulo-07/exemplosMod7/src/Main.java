public class Main {

    /**
     * @author: adds the author of a class
     * @code: display text in code font
     * @docRoot: represents the relative path to the generated document's root
     * @deprecated: adds a comment indicating that this API should no longer be used
     * @exception: adds a throws subheading to the generated documentation, with the classname and text
     * @inheritDoc: inherits a comment from the nearest inheritable class or implementable interface
     * @link: interts an in-line link with the visible texte label
     * @linkplain: link's label displayed in plain text than code font
     * @param: adds a parameter with the specified parameter-name
     * @return: adds a returns section
     * @see: adds a see also
     * @serial: default serializable field
     * @serialData: docs the data written by the writeObejct() or writeExternal methods
     * @since: adds a Since release
     * @throws: adds a throws subheading to the generated documentation, with the classname and text
     * @value: it displays the value of that constant
     * @version: adds a version
     */
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.cadastrarEndereco("Rua 1");
        cliente1.setCodigo(1);

        System.out.println(cliente1.getCodigo());
        System.out.println(cliente1.getEndereco());
        System.out.println(cliente1.retornarNomeCliente());

    }
}