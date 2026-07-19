package org.project.poolmate.service;

import org.project.poolmate.entity.RideEntity;
import org.project.poolmate.repo.RideRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService {
    @Autowired
    RideRepo repo;

    public RideEntity offerRide(RideEntity rides)
    {
        return repo.save(rides);
    }
    public List<RideEntity> getAllRides()
    {
        return repo.findAll();
    }
    public RideEntity getByDriverId(int id)
    {
        return repo.findByDriverId(id);
    }
    public RideEntity editData(RideEntity rides)
    {
        return repo.save(rides);
    }
    public String delete(int id)
    {
        repo.deleteById(id);
        return "Deleted successfully";
    }
}
