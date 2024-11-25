package Annotations.is_final;

@Immutable
public class MutableClass {
    public String name;

    public MutableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}