package com.example.surajSpringBoot.dao;

import com.example.surajSpringBoot.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccess implements PersonDAO {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> personMayBe = selectPersonById(id);
        if (personMayBe.isPresent()) {
            DB.remove(personMayBe.get());
            return 1;
        } else return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person1) {
        return selectPersonById(id)
                .map(person11 -> {
                    int indexOfPersonToUpdate = DB.indexOf(person11);
                    if (indexOfPersonToUpdate >= 0) {
                        DB.set(indexOfPersonToUpdate, new Person(id, person1.getName()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }


}
