package Uni_direction;

import Uni_direction.Entity.Answer;
import Uni_direction.Entity.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("Uni_direction/hibernate-config.xml")
                .addAnnotatedClass(Answer.class)
                .addAnnotatedClass(Question.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Question question = new Question("Q1");

        List<Answer> answerList = new ArrayList<>();
        Collections.addAll(answerList,new Answer("A1"),new Answer("A2"));



        // 1 -- 2
        question.setAnswers(answerList);


        // with Cascade, he will save Question and Answers
        session.save(question);

        session.getTransaction().commit();
    }
}
