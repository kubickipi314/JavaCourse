package Annotations.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface AnnotationExample {
    String author() default "Author1";

    int rankNumber();

}