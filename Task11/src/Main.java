import Entity.Passport;
import Entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Passport passport = new Passport( "passport1234",myDateFormat.parse("2029-09-01"));
            Person person = new Person( "mahmoud", "khaled",myDateFormat.parse("2022-01-01"));

            person.setPassport(passport);
            passport.setPerson(person);

            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}