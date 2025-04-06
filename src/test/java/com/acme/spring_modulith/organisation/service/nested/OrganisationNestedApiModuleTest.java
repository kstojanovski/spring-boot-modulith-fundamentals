package com.acme.spring_modulith.organisation.service.nested;

import com.acme.spring_modulith.person.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@ApplicationModuleTest(mode = ApplicationModuleTest.BootstrapMode.ALL_DEPENDENCIES)
public class OrganisationNestedApiModuleTest {
    @Autowired
    OrganisationNestedApi organisationNestedApi;

    @Test
    void testGetPersonsToOrganisation() {

        //Act
        Collection<Person> personsToOrganisation = organisationNestedApi.getAssignedPersons();

        //Assert
        assertThat(personsToOrganisation).hasSize(4);
    }

}
