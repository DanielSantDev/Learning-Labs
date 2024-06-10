package main.br.com.danielsantdev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("\nDigite um Nome e Sexo sequencialmente no formato Nome-Sexo, com traco e separados " +
                "por virgula. Digite 'sair' para terminar o programa :p.");
        String entrada = scanner.nextLine();

        String[] entradas = entrada.split(",");

        for (String e : entradas) {
            String[] dados = e.split("-");
            if (dados.length != 2) {
                System.out.println("Formato invalido para: " + e);
                continue;
            }
            String nome = dados[0].trim();
            String sexo = dados[1].trim();

            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                System.out.println("Sexo invalido para: " + e);
                continue;
            }

            pessoas.add(new Pessoa(nome, sexo));
        }

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        System.out.println("Mulheres:");
        mulheres.forEach(System.out::println);

        scanner.close();
    }
}
