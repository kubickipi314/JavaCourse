import lombok.NonNull;
public class NonNullExample {

    public void printMessage(@NonNull String message) {
        System.out.println(message.toUpperCase());
    }

    @NonNull
    public String getDefaultMessage() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        NonNullExample example = new NonNullExample();

        example.printMessage("This is a non-null string");

        String message = example.getDefaultMessage();
        System.out.println(message);
    }
}
