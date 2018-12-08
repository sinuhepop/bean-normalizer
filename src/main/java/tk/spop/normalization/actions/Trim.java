package tk.spop.normalization.actions;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import tk.spop.normalization.core.NormalizedBy;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@NormalizedBy(TrimNormalizer.class)
public @interface Trim {

    enum Type {
        LEFT, RIGHT, BOTH
    }

    Type value() default Type.BOTH;
}
