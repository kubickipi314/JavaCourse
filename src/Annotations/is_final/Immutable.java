package Annotations.is_final;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  // Make sure the annotation is for classes
@Retention(RetentionPolicy.SOURCE)  // Ensure it’s available at compile time
public @interface Immutable {
}
