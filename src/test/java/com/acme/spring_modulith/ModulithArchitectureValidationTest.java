package com.acme.spring_modulith;


import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ModulithArchitectureValidationTest {

    @Test
    void verifiesModularStructure() {
        ApplicationModules modules = ApplicationModules.of(SpringModulithApplication.class);
        modules.forEach(System.out::println);
        modules.verify();
    }
}
