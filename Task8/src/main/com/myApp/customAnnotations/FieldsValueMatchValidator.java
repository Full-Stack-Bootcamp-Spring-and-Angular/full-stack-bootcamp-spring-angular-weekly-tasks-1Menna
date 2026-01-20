package main.com.myApp.customAnnotations;

import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FieldsValueMatchValidator implements ConstraintValidator<FieldsValueMatch,Object> {
    // means this validator works only with Annotation FieldsValueMatch
    // and work on complete Object, not only 1 field

    // will carry fields' name not its values
    private String field;
    private String fieldMatch;

    // this called only once, when spring saw annotation
    // and read values that you write in annotation like here
    /*
    @FieldsValueMatch(
        field = "password",
        fieldMatch = "confirmPassword"
    )
    */
    @Override
    public void initialize(FieldsValueMatch constraintAnnotation) {
        this.field = constraintAnnotation.field();
        this.fieldMatch = constraintAnnotation.fieldMatch();
    }

    // The Full Work
    // Object ===> is our class object like "user"
    // get values of all fields from Object Using - BeanWrapperImpl
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        Object fieldValue = new BeanWrapperImpl(value).getPropertyValue(field);
        Object fieldMatchValue = new BeanWrapperImpl(value).getPropertyValue(fieldMatch);

        boolean valid;

        if (fieldValue != null) {
            valid = fieldValue.equals(fieldMatchValue);
        } else {
            valid = fieldMatchValue == null;
        }


        // to make message error appear for "confirmPassword" field, instead of whole object
        if (!valid) {
            // stop default message
            context.disableDefaultConstraintViolation();

            //  add message for confirmPassword
            context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
                    .addPropertyNode(fieldMatch)
                    .addConstraintViolation();
        }
        return valid;
    }
}
