package com.acme.spring_modulith.organisation.controller;

import com.acme.spring_modulith.organisation.service.OrganisationService;
import com.acme.spring_modulith.person.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/organisation")
class OrganisationController {

    OrganisationService organisationService;

    OrganisationController(OrganisationService organisationService) {
        this.organisationService = organisationService;
    }

    @GetMapping("/get-assigned-persons")
    Collection<Person> getAssignedPersons() {
        return organisationService.getAssignedPersons();
    }
}
