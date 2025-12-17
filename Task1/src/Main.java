import com.example1.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // define container
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve beans
        Shape Circle = container.getBean("circle", Shape.class);
        Circle.getArea(3);
        Shape Square = container.getBean("square", Shape.class);
        Square.getArea(3);
    }
}