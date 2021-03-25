package hu.eszterhazy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Granary granary= Granary.getInstance();
        granary.insertProduct(new Product());
        System.out.println(granary);
    }
}
