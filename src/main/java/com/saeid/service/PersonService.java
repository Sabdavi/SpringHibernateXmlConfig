package com.saeid.service;

import com.saeid.dao.PersonDao;
import com.saeid.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {

    private PersonDao personDao;

    @Autowired
    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public List<Person> getPersons(){
        return personDao.getPersons();
    }
}
