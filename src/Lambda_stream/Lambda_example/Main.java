package Lambda_stream.Lambda_example;

@FunctionalInterface
interface MathOperation {
    int operation ( int a , int b ) ;
}

public class Main {
    public static void main(String[] args){
        MathOperation addition = (int x, int y) -> x + y;
        MathOperation subtraction = (x,y) -> x - y;
        MathOperation multiplication = (int x, int y) -> {return x * y;};

        System.out.println(addition.operation(3,4));
        System.out.println(subtraction.operation(6,3));
        System.out.println(multiplication.operation(2,2));
    }
}
//java_repo
//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