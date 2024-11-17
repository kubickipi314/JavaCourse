import java.util.ArrayList;
import java.util.List;

public class Main {

    static class Example {
        @Deprecated public void reallyOldMethod() {
            System.out.println("Old method");
        }

        @SuppressWarnings({"rawtypes", "unused"})  public void WarningMethod() {
            List list = new ArrayList();
        }

        @SafeVarargs public final void safeVarargsMethod(List<String>... lists) {
            for (List<String> list : lists) {
                System.out.println(list);
            }
        }
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.reallyOldMethod();
        ex.WarningMethod();
        ex.safeVarargsMethod(new ArrayList<>(), new ArrayList<>());
    }
}
