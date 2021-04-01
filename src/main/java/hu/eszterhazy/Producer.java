package hu.eszterhazy;


import java.sql.Timestamp;

public class Producer {

    private final GranaryProducer granary;

    public Producer(Granary granary) {
        this.granary = granary;
    }

    public void testProducer(){
        Product product = new Product(new Timestamp(System.currentTimeMillis()).toString());
        granary.insertProduct(product);
        System.out.printf("A producer had added a new product: %s%n", product);
    }

}
