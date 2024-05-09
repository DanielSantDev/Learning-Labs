package br.com.danielsantdev;

import br.com.danielsantdev.Pessoa;

import java.util.List;


public class ExemplosCount {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();

        System.out.println(count);
    }
}
