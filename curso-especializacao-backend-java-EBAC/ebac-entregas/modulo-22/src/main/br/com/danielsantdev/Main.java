package main.br.com.danielsantdev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite um Nome e logo apos o Sexo. Digite 'sair' para terminar o programa :p.");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine();
            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                System.out.println("Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino.");
                continue;
            }

            pessoas.add(new Pessoa(nome, sexo));
        }

        // filtro das mulheres
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        System.out.println("Mulheres:");
        mulheres.forEach(System.out::println);

        scanner.close();
    }
}
