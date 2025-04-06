package com.acme.spring_modulith.organisation;

import com.acme.spring_modulith.person.Person;
import com.acme.spring_modulith.person.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AssignPersonsToOrganisationInvalid {

    /*
    private final PersonService personService;

    public AssignPersonsToOrganisationInvalid(PersonService personService) {
        this.personService = personService;
    }

    public Collection<Person> getAssignedPersons() {
        return personService.getPersons().stream().filter(person -> person.firstName().equals("John")).toList();
    }
    */

}
