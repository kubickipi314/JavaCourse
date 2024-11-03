package Lambda_stream.Lambda_lambda;

public class ResourceRunnable {
     public String resource = "Resourse";
    public Runnable getRunnable() {
        return () -> System.out.println(this.resource); //this: odwołanie do klasy nadrzędnej
    }
}
