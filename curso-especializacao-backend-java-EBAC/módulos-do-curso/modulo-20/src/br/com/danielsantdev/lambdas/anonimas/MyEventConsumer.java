package br.com.danielsantdev.lambdas.anonimas;


@FunctionalInterface
public interface MyEventConsumer {

    public void consumer(Object value);

    default void calcular() {

    }
}
