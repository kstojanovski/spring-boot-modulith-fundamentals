package com.acme.spring_modulith.organisation;

import com.acme.spring_modulith.person.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@ApplicationModuleTest(mode = ApplicationModuleTest.BootstrapMode.ALL_DEPENDENCIES)
public class AssignPersonsToOrganisationModuleTest {

    @Autowired
    AssignPersonsToOrganisation assignPersonsToOrganisation;

    @Test
    void testGetPersonsToOrganisation() {

        //Act
        Collection<Person> personsToOrganisation = assignPersonsToOrganisation.getAssignedPersons();

        //Assert
        assertThat(personsToOrganisation).hasSize(1);
    }
}
