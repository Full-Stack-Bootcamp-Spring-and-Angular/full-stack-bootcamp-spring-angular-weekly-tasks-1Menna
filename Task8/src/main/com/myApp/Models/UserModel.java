package main.com.myApp.Models;

import lombok.Getter;
import lombok.Setter;
import main.com.myApp.customAnnotations.FieldsValueMatch;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@FieldsValueMatch(
    field = "password",
    fieldMatch = "confirmPassword",
    message = "Passwords do not match!"
)
@Component
@Setter
@Getter
public class UserModel {
    @NotBlank (message ="this field cannot empty or null")
    private String userName;

    @NotBlank (message ="Password is required")
    @Size ( min=8, message = "Password must be at least 8 characters")
    private String password;


    private String confirmPassword;

    @NotBlank (message ="this field cannot empty or null")
    @Pattern(regexp = "^(.+)@(\\S+)$" ,message = "please enter a valid email")
    private String email;

}
