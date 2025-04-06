package com.acme.spring_modulith.company.service;

import com.acme.spring_modulith.organisation.service.named.OrganisationNamePerson;
import com.acme.spring_modulith.person.service.vip.VipPerson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@ApplicationModuleTest(mode = ApplicationModuleTest.BootstrapMode.ALL_DEPENDENCIES)
public class CompanyServiceModuleTest {

    @Autowired
    CompanyService companyService;

    @Test
    void testGetPersonsToGovernment() {

        //Act
        Collection<OrganisationNamePerson> personsToGovernment = companyService.getPeople();

        //Assert
        assertThat(personsToGovernment).hasSize(4);
    }
}
