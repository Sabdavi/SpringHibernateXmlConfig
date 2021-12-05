package com.saeid.controller;

import com.saeid.entity.Person;
import com.saeid.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/persons")
        public ResponseEntity<List<Person>>  getPersons(){
        List<Person> persons = service.getPersons();
        return new ResponseEntity<>(persons, HttpStatus.ACCEPTED);
    }
}
