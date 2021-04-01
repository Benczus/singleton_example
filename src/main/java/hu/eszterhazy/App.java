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
       Consumer consumer= new Consumer(granary);
       Producer producer = new Producer(granary);
       producer.testProducer();
       producer.testProducer();
       consumer.testConsumer();
       System.out.println(granary.toString());
    }
}
