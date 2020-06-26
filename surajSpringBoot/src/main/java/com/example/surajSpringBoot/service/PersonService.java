package com.example.surajSpringBoot.service;

import com.example.surajSpringBoot.dao.PersonDAO;
import com.example.surajSpringBoot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int addPerson(Person person) {
        return personDAO.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDAO.selectAllPeople();
    }
}
