package com.acme.spring_modulith;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

public class DocumentModulesTest {
    @Test
    void createModuleDocumentation() {
        ApplicationModules modules = ApplicationModules.of(SpringModulithApplication.class);
        new Documenter(modules)
                .writeDocumentation()
                .writeIndividualModulesAsPlantUml();
    }
}
