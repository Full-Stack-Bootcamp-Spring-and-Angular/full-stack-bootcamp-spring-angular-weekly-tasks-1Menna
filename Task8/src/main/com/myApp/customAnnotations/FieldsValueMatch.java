package main.com.myApp.customAnnotations;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // to be existed during runtime so spring can see it
@Target({ ElementType.TYPE }) // this annotation is to put on class not on field ...
@Constraint(validatedBy = FieldsValueMatchValidator.class) // use the provided class to make validation
public @interface FieldsValueMatch {
    String message() default "Fields values don't match!";

    String field(); // name of first field
    String fieldMatch(); // name of second field that must be equal to first

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    // this part only put it, if you had more than 1 pair that need to be compared
    // like password, ConfirmPassword && email, ConfirmEmail && ....
    @Target({ ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        FieldsValueMatch[] value();
    }


}
