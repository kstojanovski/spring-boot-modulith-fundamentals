package com.acme.spring_modulith.government.service;


import com.acme.spring_modulith.person.service.vip.VipPerson;
import com.acme.spring_modulith.person.service.vip.VipPersonApi;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GovernmentService {

    private final VipPersonApi vipPersonApiImpl;

    public GovernmentService(VipPersonApi vipPersonApiImpl) {
        this.vipPersonApiImpl = vipPersonApiImpl;
    }

    public Collection<VipPerson> getVipPersons() {
        return vipPersonApiImpl.getPersons().stream()
                .filter(person -> person.firstName().equals("John")).toList();
    }
}
