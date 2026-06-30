package org.project.student.repo;

import org.project.student.entity.SEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SRepo extends JpaRepository<SEntity,Integer>
{

}

