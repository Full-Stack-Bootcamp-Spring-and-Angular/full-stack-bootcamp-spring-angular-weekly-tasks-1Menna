package Bi_direction;


import Bi_direction.Entity.Instructor;
import Bi_direction.Entity.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("Bi_direction/hibernate-config.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Instructor instructor = new Instructor("Ahmed");

        List<Course> courseList = new ArrayList<>();
        Collections.addAll(courseList,new Course("Java"),new Course("Python"));


        // 1 -- 2
        instructor.setCourses(courseList);

        // 2 -- 1
        for(Course course: courseList ){
            course.setInstructor(instructor);
        }


        // with Cascade, he will save instructor and courses
        session.save(instructor);

        session.getTransaction().commit();
    }
}
