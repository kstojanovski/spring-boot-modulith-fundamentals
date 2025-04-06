package com.acme.spring_modulith.company.service;

import com.acme.spring_modulith.organisation.service.named.OrganisationNamePerson;
import com.acme.spring_modulith.organisation.service.named.OrganisationNamedApiImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ApplicationModuleTest
public class CompanyServiceMockedModuleTest {

    @MockitoBean
    OrganisationNamedApiImpl organisationNamedApiImpl;

    @Autowired
    CompanyService companyService;

    @Test
    void testGetPersonsToGovernment() {
        //Arrange
        when(organisationNamedApiImpl.getNamedAssignedPersons()).thenReturn(
            List.of(
                new OrganisationNamePerson("Jane", "Smith"),
                new OrganisationNamePerson("Jack", "Smith"),
                new OrganisationNamePerson("Jill", "Smith"),
                new OrganisationNamePerson("John", "Smith")
            )
        );

        //Act
        Collection<OrganisationNamePerson> personsToGovernment = companyService.getPeople();

        //Assert
        assertThat(personsToGovernment).hasSize(4);
    }
}
