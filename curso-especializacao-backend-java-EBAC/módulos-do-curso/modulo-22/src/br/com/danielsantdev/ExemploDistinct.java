package br.com.danielsantdev;

import br.com.danielsantdev.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class ExemploDistinct {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        Stream<Pessoa> stream = lista.stream().distinct();
    }
}
