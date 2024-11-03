package Generics.Bridge;


public class Node<T> {
    public T data;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) throws Exception {
        System.out.println("Node.setData");
        this.data = data;
    }
}

//  SKONWERTOWANE DO:
//public class Node {
//    public Object data;
//
//    public Node(Object data) {
//        this.data = data;
//    }
//
//    public void setData(Object data) {
//        System.out.println(" Node.setData ");
//        this.data = data;
//    }


//}
