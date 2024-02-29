package TemplateMethod;

public class Bombeiro extends Trabalhador {

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como bombeiro");
    }
}