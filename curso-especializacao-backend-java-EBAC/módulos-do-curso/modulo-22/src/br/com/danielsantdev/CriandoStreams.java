package br.com.danielsantdev;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        Stream<String> stream = List.of("Rodrigo", "Pires", "Teste").stream();

        Stream<String> set = Set.of("Rodrigo", "Pires", "Teste").stream();

        Map<String, String> map = Map.of("Rodrigo", "Pires");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("String", "asds");
    }
}
