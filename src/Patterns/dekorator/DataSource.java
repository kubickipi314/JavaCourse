package Patterns.dekorator;


public interface DataSource {
    void writeData(String data);

    String readData();
}
