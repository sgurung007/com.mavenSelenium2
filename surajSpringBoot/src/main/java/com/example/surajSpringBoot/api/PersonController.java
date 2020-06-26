package com.example.surajSpringBoot.api;

import com.example.surajSpringBoot.model.Person;
import com.example.surajSpringBoot.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
