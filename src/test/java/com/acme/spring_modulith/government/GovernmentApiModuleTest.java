package com.acme.spring_modulith.government;

import com.acme.spring_modulith.person.service.vip.VipPerson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@ApplicationModuleTest(mode = ApplicationModuleTest.BootstrapMode.ALL_DEPENDENCIES)
public class GovernmentApiModuleTest {
    @Autowired
    GovernmentApi governmentApi;

    @Test
    void testGetPersonsToGovernment() {

        //Act
        Collection<VipPerson> personsToGovernment = governmentApi.getVipPersons();

        //Assert
        assertThat(personsToGovernment).hasSize(1);
    }

}
