package br.com.danielsantdev.lambdas.anonimas;


@FunctionalInterface
public interface MyEventConsumerReturn<T> {

    public T consumer(Object value);

}
