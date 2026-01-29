import Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        // Create Object
        User user = new User(1,"Mariam","123456");

        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

        // Read Object
        session.beginTransaction();
        User user1 = session.get(User.class,1);

        System.out.println(user1.toString());

        session.getTransaction().commit();

        // Update Object
        session.beginTransaction();
        User user2 = session.get(User.class,1);
        user.setPasswrd("menna123");
        session.save(user2);
        session.getTransaction().commit();

        // Delete Object
        session.beginTransaction();
        User user3 = session.get(User.class,1);
        session.delete(user3);
        session.getTransaction().commit();


    }
}