package com.acme.spring_modulith.person.service.vip;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class VipPersonApiImpl implements VipPersonApi {

    private final ConcurrentHashMap<String, VipPerson> persons = new ConcurrentHashMap<>();

    VipPersonApiImpl() {
        persons.put("Bob", new VipPerson("Bob", "Bond"));
        persons.put("Jane", new VipPerson("Jane", "Bond"));
        persons.put("Jack", new VipPerson("Jack", "Bond"));
        persons.put("John", new VipPerson("John", "Bond"));
        persons.put("James", new VipPerson("James", "Bond"));
    }

    @Override
    public Collection<VipPerson> getPersons() {
        return persons.values();
    }
}
