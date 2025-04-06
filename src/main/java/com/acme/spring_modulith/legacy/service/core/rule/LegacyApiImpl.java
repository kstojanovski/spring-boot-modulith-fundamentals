package com.acme.spring_modulith.legacy.service.core.rule;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class LegacyApiImpl implements LegacyApi {
    @Override
    public Collection<LegacyPerson> getLegacyPersons() {
        return List.of(
                new LegacyPerson("Patrick", "Doe"),
                new LegacyPerson("Daisy", "Doe")
        );
    }
}
