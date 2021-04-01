package hu.eszterhazy;

public class Consumer {

    private final GrandaryConsumer granary;

    public Consumer(Granary granary) {
        this.granary = granary;
    }

    public void testConsumer(){
        Product product = granary.popProduct();
        System.out.printf("Consumer has taken out:%s%n", product);
    }
}
