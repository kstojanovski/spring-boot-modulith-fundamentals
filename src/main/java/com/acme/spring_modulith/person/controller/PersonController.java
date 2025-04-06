package com.acme.spring_modulith.person.controller;

import com.acme.spring_modulith.legacy.service.core.rule.LegacyApi;
import com.acme.spring_modulith.legacy.service.core.rule.LegacyPerson;
import com.acme.spring_modulith.person.Person;
import com.acme.spring_modulith.person.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/person")
class PersonController {

    private final PersonService personService;
    private final LegacyApi legacyApi;

    PersonController(PersonService personService, LegacyApi legacyApi) {
        this.personService = personService;
        this.legacyApi = legacyApi;
    }

    @GetMapping("/get-all")
    Collection<Person> getPersons() {
        return personService.getPersons();
    }

    @GetMapping("/get-all-legacy")
    Collection<LegacyPerson> getLegacyPersons() {
        return legacyApi.getLegacyPersons();
    }
}
