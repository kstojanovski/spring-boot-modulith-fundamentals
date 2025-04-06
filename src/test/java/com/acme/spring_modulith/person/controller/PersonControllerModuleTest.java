package com.acme.spring_modulith.person.controller;

import com.acme.spring_modulith.legacy.service.core.rule.LegacyPerson;
import com.acme.spring_modulith.person.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@ApplicationModuleTest(mode = ApplicationModuleTest.BootstrapMode.DIRECT_DEPENDENCIES)
public class PersonControllerModuleTest {

    @Autowired
    private PersonController personController;

    @Test
    void testGetPersons() {

        //Act
        Collection<Person> persons = personController.getPersons();

        //Assert
        assertThat(persons).hasSize(2);
    }

    @Test
    void testGetLegacyPersons() {

        //Act
        Collection<LegacyPerson> persons = personController.getLegacyPersons();

        //Assert
        assertThat(persons).hasSize(2);
    }
}
