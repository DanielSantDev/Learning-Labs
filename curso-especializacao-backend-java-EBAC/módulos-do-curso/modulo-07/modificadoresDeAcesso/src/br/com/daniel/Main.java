package br.com.daniel;

    /*Modificadores de acesso são as palavras-chave usadas para especificar a acessibilidade da declaração de um membro ou um tipo.
     *Public: Com este modificador, o acesso é livre em qualquer lugar do programa.
     *
     *Private: Com este modificador, o acesso é permitido somente dentro da classe onde ele foi declarado.
     *Por padrão, é a visibilidade definida para métodos e atributos em uma classe.
     *
     *Protected: Com este modificador, apenas a classe que contém o modificador e os tipos derivados dessa classe tem o acesso.
     *
     *Internal: Com este modificador, o acesso é limitado apenas ao assembly atual.
     *
     *Protected Internal: Com este modificador, o acesso é limitado ao assembly atual e aos tipos derivados da classe
     que contém o modificador.
     * */

import br.com.daniel.pacote1.Cliente;
import br.com.daniel.pacote1.Funcionario;

public class Main {

    public static void main(String[] args) {

        Funcionario Marcos = new Funcionario();
        Cliente Cliente01 = new Cliente();

        Marcos.setNumeroAcesso(01);
        System.out.println(Marcos.getNumeroAcesso());

        Cliente01.codigo = 01;
        System.out.println(Cliente01.codigo);

    }

}
