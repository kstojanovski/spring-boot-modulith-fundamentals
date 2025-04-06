package com.acme.spring_modulith.organisation;

import com.acme.spring_modulith.organisation.service.nested.OrganisationNestedApi;
import com.acme.spring_modulith.organisation.service.nested.OrganisationNestedApiImpl;
import com.acme.spring_modulith.person.Person;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class OrganisationApiImpl {

    OrganisationNestedApi organisationNestedApiImpl;

    OrganisationApiImpl(OrganisationNestedApi organisationNestedApiImpl) {
        this.organisationNestedApiImpl = organisationNestedApiImpl;
    }

    public Collection<Person> getPeopleOfOrganisations() {
        return organisationNestedApiImpl.getAssignedPersons();
    }

}
