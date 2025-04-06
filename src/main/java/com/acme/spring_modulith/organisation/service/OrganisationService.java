package com.acme.spring_modulith.organisation.service;

import com.acme.spring_modulith.organisation.AssignPersonsToOrganisation;
import com.acme.spring_modulith.person.Person;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class OrganisationService {

    private final AssignPersonsToOrganisation assignPersonsToOrganisation;

    OrganisationService(AssignPersonsToOrganisation assignPersonsToOrganisation) {
        this.assignPersonsToOrganisation = assignPersonsToOrganisation;
    }

    public Collection<Person> getAssignedPersons() {
        return assignPersonsToOrganisation.getAssignedPersons();
    }
}
