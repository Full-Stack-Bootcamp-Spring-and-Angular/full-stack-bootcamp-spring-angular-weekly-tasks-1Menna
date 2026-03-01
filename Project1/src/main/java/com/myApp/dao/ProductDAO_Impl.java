package com.myApp.dao;

import com.myApp.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProductDAO_Impl implements ProductDAO{
    @Autowired
    SessionFactory sessionFactory;

    public Product insert(Product product){
        Session session = sessionFactory.getCurrentSession();
        session.save(product);
        return product;
    }
    public Product findById(int id){
        Session session = sessionFactory.getCurrentSession();
        return session.get(Product.class,id);
    }
    public Product deleteById(int id){
        Session session = sessionFactory.getCurrentSession();
        Product product = session.get(Product.class,id);
        session.delete(product);
        return product;
    }
    public Product update(Product product){
        Session session = sessionFactory.getCurrentSession();
        session.update(product);
        return product;
    }
    public List<Product> getAllProducts(){
        Session session = sessionFactory.getCurrentSession();
        Query q = session.createQuery("from Product");
        List<Product> productList = q.getResultList();
        return  productList;
    }
}
