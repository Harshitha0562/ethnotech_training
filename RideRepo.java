package org.project.poolmate.repo;

import org.project.poolmate.entity.RideEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepo extends JpaRepository<RideEntity,Integer> {
    public RideEntity findByDriverId(int driverID);
    public String deleteById(int id);
}
