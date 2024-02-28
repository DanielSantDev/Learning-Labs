package Singleton;
/*
*  O padrão Singleton é projetado para garantir que uma classe tenha apenas uma instância e fornecer um ponto global
* para acessá-la. Uma vez que a instância única tenha sido criada, tentativas subsequentes de criar novas instâncias
* resultarão na devolução da instância já existente.* */

public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        //ñ pode ser mais instanciado dps de ser instanciado pela primeira vez
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}