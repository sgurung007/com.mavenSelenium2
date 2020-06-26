package com.example.surajSpringBoot.service;

import com.example.surajSpringBoot.dao.PersonDAO;
import com.example.surajSpringBoot.model.Person;

public class PersonService {
    private final PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int addPerson(Person person) {
        return personDAO.insertPerson(person);
    }
}
