package com.acme.spring_modulith.organisation.controller;

import com.acme.spring_modulith.person.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@ApplicationModuleTest(mode = ApplicationModuleTest.BootstrapMode.ALL_DEPENDENCIES)
public class OrganisationControllerModuleTest {
    @Autowired
    OrganisationController organisationController;

    @Test
    void testGetPersonsToOrganisation() {

        //Act
        Collection<Person> personsToOrganisation = organisationController.getAssignedPersons();

        //Assert
        assertThat(personsToOrganisation).hasSize(1);
    }

}
