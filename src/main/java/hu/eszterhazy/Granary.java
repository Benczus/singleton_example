package hu.eszterhazy;

import java.util.PriorityQueue;
import java.util.Queue;

public class Granary {

    public static int Limit = 3000;
    private Queue<Product> productQueue = new PriorityQueue<>();

    private static final Granary instance = new Granary();


    public static Granary getInstance() {
        return instance;
    }

    private Granary() {
    }

    public void insertProduct(Product product){
        this.productQueue.add(product);
    }

    public Product popProduct(){
        return this.productQueue.poll();
    }

    @Override
    public String toString() {
        return "Granary{" +
                "size=" + productQueue.size() +
                '}';
    }
}
