import Entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.text.SimpleDateFormat;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        // ==========================================================================================
        // get all records for Product
        session.beginTransaction();
        Query q1 = session.createQuery("from Product");
        List<Product> productList = q1.getResultList();


        for (Product product : productList) {
            System.out.println(product);
        }

        // ==========================================================================================
        // Update
        session.beginTransaction();
        Query q2 = session.createQuery("update Product set price=:n where id=:i");
        q2.setParameter("n",30.99);
        q2.setParameter("i",2);

        int status = q2.executeUpdate();
        System.out.println(status);

        session.getTransaction().commit();


        // ==========================================================================================
        // get records with pagination
        session.beginTransaction();
        Query q3 = session.createQuery("from Product");

        q3.setFirstResult(2);
        q3.setMaxResults(5);

        List<Product> ProductList = q3.getResultList();
        for(Product product : ProductList){
            System.out.println(product);
        }
        session.getTransaction().commit();


        // ==========================================================================================
        // using Aggregation Functions
        session.beginTransaction();
        Query q4 = session.createQuery("select sum(price) from Product");
        Double sum = (Double) q4.getSingleResult();
        System.out.println(String.format("Sum of Prices is %.2f",sum));

        session.getTransaction().commit();


        // ==========================================================================================
        // add Object to test adding Date (Without Writing HQL)
        try {
            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            Product product = new Product("fish", "good food", 90.3, 3, "Egypt Food",
                    myFormat.parse("2022-12-1"));

            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace(); // handle ParseException or Hibernate exceptions
        } finally {
            sessionFactory.close();
        }

        // ==========================================================================================



    }
}