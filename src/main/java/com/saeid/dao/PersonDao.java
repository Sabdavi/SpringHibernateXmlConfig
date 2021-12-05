package com.saeid.dao;

import com.saeid.entity.Person;
import org.hibernate.SessionFactory;
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
        return sessionFactory.openSession().createQuery("FROM Person ").list();
    }
}
