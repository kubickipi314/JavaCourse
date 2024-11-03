package Generics.Bridge;

public class Main {
    public static void main(String[] args) throws Exception {
        Node<Integer> node = new MyNode(5);
        node.setData(4);
    }
}
