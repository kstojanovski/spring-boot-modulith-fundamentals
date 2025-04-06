package com.acme.spring_modulith.organisation.service.nested;

import com.acme.spring_modulith.person.Person;

import java.util.Collection;

public interface OrganisationNestedApi {

    Collection<Person> getAssignedPersons();
}
