package com.acme.spring_modulith.person;

import com.acme.spring_modulith.person.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PersonApiImpl implements PersonApi {

    private final PersonService personService;

    public PersonApiImpl(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public Collection<Person> getPersons() {
        return personService.getPersons();
    }
}
