package com.acme.spring_modulith.organisation.service.named;

import com.acme.spring_modulith.organisation.service.nested.OrganisationNestedApi;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class OrganisationNamedApiImpl {

    OrganisationNestedApi organisationNestedApi;

    OrganisationNamedApiImpl(OrganisationNestedApi organisationNestedApi) {
        this.organisationNestedApi = organisationNestedApi;
    }

    public Collection<OrganisationNamePerson> getNamedAssignedPersons() {
        return organisationNestedApi.getAssignedPersons().stream()
                .map(person -> new OrganisationNamePerson(person.firstName(), person.lastName()))
                .collect(Collectors.toList());
    }
}
