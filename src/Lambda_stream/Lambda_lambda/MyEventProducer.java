package Lambda_stream.Lambda_lambda;

import java.util.function.Consumer;

public class MyEventProducer {
    private Consumer<String> listener;

    public void listen(Consumer<String> listener) {
        this.listener = listener;
    }

    public void triggerEvent(String event) {
        if (listener != null) {
            listener.accept(event);
        }
    }
}
