package Annotations.is_final;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("Annotations.is_final.Immutable")
@SupportedSourceVersion(SourceVersion.RELEASE_20)
public class SimpleAnnotationProcessor extends AbstractProcessor {
    public SimpleAnnotationProcessor(){}

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        System.out.println("hahahahhaha");
    }

    @Override
    public boolean process(final Set<? extends TypeElement> annotations, final RoundEnvironment roundEnv) {
        System.out.println("processing...");
        for (final Element element :
                roundEnv.getElementsAnnotatedWith(Immutable.class)) {
            if (element instanceof TypeElement typeElement) {
                for (final Element eclosedElement : typeElement.getEnclosedElements()) {
                        // process enclosedElement
                        if (eclosedElement instanceof VariableElement variableElement){
                            if (!variableElement.getModifiers().contains(Modifier.FINAL))
                                processingEnv.getMessager().printMessage(
                                        Diagnostic.Kind.ERROR,
                                        String.format("Class %s is annotated as @Immutable, but field %s is not declared as final" ,
                                                typeElement.getSimpleName(),
                                                variableElement.getSimpleName())
                                );
                    }
                }
            }
        }
        // Claim that annotations have been processed by this processor
        return false;
    }
}