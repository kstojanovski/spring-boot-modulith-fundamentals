package com.acme.spring_modulith.company.service;

import com.acme.spring_modulith.organisation.service.named.OrganisationNamePerson;
import com.acme.spring_modulith.organisation.service.named.OrganisationNamedApiImpl;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CompanyService {

    private final OrganisationNamedApiImpl organisationNamedApiImpl;

    CompanyService(OrganisationNamedApiImpl organisationNamedApiImpl) {
        this.organisationNamedApiImpl = organisationNamedApiImpl;
    }

    public Collection<OrganisationNamePerson> getPeople() {
        return organisationNamedApiImpl.getNamedAssignedPersons();
    }

}
