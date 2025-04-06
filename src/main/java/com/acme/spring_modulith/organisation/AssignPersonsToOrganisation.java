package com.acme.spring_modulith.organisation;

import com.acme.spring_modulith.person.Person;
import com.acme.spring_modulith.person.PersonApi;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AssignPersonsToOrganisation {

    private final PersonApi personApi;

   public AssignPersonsToOrganisation(PersonApi personApi) {
        this.personApi = personApi;
   }

   public Collection<Person> getAssignedPersons() {
       return personApi.getPersons().stream().filter(person -> person.firstName().equals("John")).toList();
   }

}
