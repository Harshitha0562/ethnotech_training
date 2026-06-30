package org.project.votingcalc.service;

import jakarta.persistence.Entity;
import org.project.votingcalc.entity.VEntity;
import org.project.votingcalc.repo.VRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    private VRepo repo;
    public VEntity storeData(VEntity v)//as we are getting all data from controller so datatype is VEntity
    {
        if(v.getAge()>=18)
        {
            v.setEligible(true);
        }
        return repo.save(v);
    }
    public List<VEntity> getBYEle(boolean isEligible)
    {
        
    }
}
