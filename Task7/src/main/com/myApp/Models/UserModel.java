package main.com.myApp.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Setter
@Getter
public class UserModel {
    private String userName,password;
    private String country;
    private String programmingLanguage;
    private List<String> operatingSystem;
}
