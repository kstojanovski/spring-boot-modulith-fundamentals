package com.acme.spring_modulith.person.service;

import com.acme.spring_modulith.person.Person;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PersonService {

    private final ConcurrentHashMap<String, Person> persons = new ConcurrentHashMap<>();

    PersonService() {
        persons.put("John", new Person("John", "Doe"));
        persons.put("Jane", new Person("Jane", "Smith"));
    }

    public Collection<Person> getPersons() {
        return persons.values();
    }
}
