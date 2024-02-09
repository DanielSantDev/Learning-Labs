public class Boxing {
    public static void main(String[] args) {

        int valorPrimitivo1 = 505;
//      Boxing: Convertendo o tipo primitivo para seu wrapper (Integer)
        Integer valorWrapper1 = valorPrimitivo1;
        System.out.println(valorWrapper1);


        Integer valorWrapper2 = 123;
//      Unboxing: Convertendo o wrapper de volta para o tipo primitivo (int)
        int valorPrimitivo2 = valorWrapper2;
        System.out.println(valorPrimitivo2);
    }
}