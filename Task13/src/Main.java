import Entity.Course;
import Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        List<Student> students =new ArrayList<>();
        students.add(new Student("menna"));
        students.add(new Student("Nour"));
        students.add(new Student("Ahmed"));

        List<Course>courses = new ArrayList<>();
        courses.add(new Course("JAVA"));
        courses.add(new Course("Python"));
        courses.add(new Course("CPP"));

        for(Course course:courses){
            session.save(course);
        }

        for(Student student:students){
            student.setCourses(courses);
            session.save(student);
        }


        session.getTransaction().commit();


    }
}