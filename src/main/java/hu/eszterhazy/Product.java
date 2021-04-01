package hu.eszterhazy;

public class Product implements Comparable{

    private String id;

    public Product(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        Product product = (Product) o; // explicit casting, and it creates an error, if it cannot be cast
        return id.compareTo(product.id);
    }
}
