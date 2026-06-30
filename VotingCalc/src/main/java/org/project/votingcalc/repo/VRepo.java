package org.project.votingcalc.repo;

import org.project.votingcalc.entity.VEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VRepo extends JpaRepository<VEntity,Integer>
{
    public List<VEntity> findByIsEligible(boolean isEligible);
}
//VEntity=relation name
//Integr=datatype of primarykey