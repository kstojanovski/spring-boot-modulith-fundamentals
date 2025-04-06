package com.acme.spring_modulith.organisation.service.nested;

import com.acme.spring_modulith.person.Person;
import com.acme.spring_modulith.person.PersonApi;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class OrganisationNestedApiImpl implements OrganisationNestedApi {

    private final PersonApi personApi;

    public OrganisationNestedApiImpl(PersonApi personApi) {
        this.personApi = personApi;
    }

    @Override
    public Collection<Person> getAssignedPersons() {
        List<Person> people = new java.util.ArrayList<>(personApi.getPersons().stream().filter(person -> person.firstName().equals("John")).toList());
        people.add(new Person("Jack", "Smith"));
        people.add(new Person("Jill", "Smith"));
        people.add(new Person("John", "Smith"));
        return people;
    }

}
