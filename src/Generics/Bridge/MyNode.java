package Generics.Bridge;

public class MyNode extends Node<Integer> {
    public MyNode(Integer data) {
        super(data);
    }
    public void setData(Integer data) throws Exception {
        System.out.println("MyNode.setData");
        super.setData(data);
        throw new Exception();
    }
}

//  SKONWERTOWANE DO
//public class MyNode extends Node {
//    public MyNode(Integer data) {
//        super(data);
//    }
//
//    public void setData ( Object data ) { //<-BRIDGE METHOD
//        setData (( Integer ) data ) ;
//    }
//
//    public void setData(Integer data) {
//        System.out.println(" MyNode.setData ");
//        super.setData(data);
//    }
//}
