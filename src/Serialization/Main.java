import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Name n = new Name (" Ash ", " Ketchum ");

        FileOutputStream str = new FileOutputStream( " file . out " );
        ObjectOutputStream out = new ObjectOutputStream(str);
        out . writeObject (n);

        FileInputStream file = new FileInputStream( " file . out " );
        ObjectInputStream in = new ObjectInputStream ( file );
        n = (Name) in.readObject();

        System.out.println(n.getFirstName() + n.getLastName());
    }


}