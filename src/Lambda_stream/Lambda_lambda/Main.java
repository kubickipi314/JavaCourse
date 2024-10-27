package Lambda_stream.Lambda_lambda;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        double a = 10.0;
        double b = 5.0;

        System.out.println("\nAll Operations:");
        for (Operation op : Operation.values()) {
            System.out.println(a + " " + op + " " + b + " = " + op.apply(a, b));
        }


        ResourceRunnable rr = new ResourceRunnable();
        Runnable lambda = rr.getRunnable();
        lambda.run();
        rr.resource = "NewResource";
        lambda.run();

        System.out.print('\n');

        MyEventProducer eventProducer = new MyEventProducer();
        EventConsumerImpl consumer = new EventConsumerImpl();

        consumer.attach(eventProducer);

        eventProducer.triggerEvent("TestEvent");
    }
}