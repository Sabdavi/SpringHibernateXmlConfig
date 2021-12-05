package com.saeid.dao;

import com.saeid.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDao {
    private SessionFactory sessionFactory;

    @Autowired
    public PersonDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Person> getPersons(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Person person = new Person();
        person.setName("saeid");
        person.setFamily("abdavi");
        session.save(person);
        transaction.commit();

        //return Arrays.asList(person);
        return sessionFactory.openSession().createQuery("FROM Person ").list();
    }
}
