package org.project.calc.repo;

import org.project.calc.entity.AddEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalcRepo extends JpaRepository<AddEntity,Integer> {

}
