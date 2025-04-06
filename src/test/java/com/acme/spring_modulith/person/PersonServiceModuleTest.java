package com.acme.spring_modulith.person;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@ApplicationModuleTest(mode = ApplicationModuleTest.BootstrapMode.DIRECT_DEPENDENCIES)
public class PersonServiceModuleTest {

    @Autowired
    PersonApiImpl personApiImpl;

    @Test
    void testGetPersons() {

        //Act
        Collection<Person> persons = personApiImpl.getPersons();

        //Assert
        assertThat(persons).hasSize(2);
    }
}
