package org.project.poolmate.controller;

import org.project.poolmate.entity.RideEntity;
import org.project.poolmate.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RideController {
    @Autowired
    RideService ser;

    @PostMapping("/offerRides")
    public RideEntity offer(@RequestBody RideEntity ride)
    {
        return ser.offerRide(ride);
    }

    @GetMapping("/getAll")
    public List<RideEntity> getAll()
    {
        return ser.getAllRides();
    }

    @GetMapping("/getById/{id}")
    public RideEntity getById(@PathVariable int id)
    {
        return ser.getByDriverId(id);
    }

    @PutMapping("/editRide")
    public RideEntity editing(@RequestBody RideEntity rides)
    {
        return ser.editData(rides);
    }

    @DeleteMapping("/deleteRide/{id}")
    public String delete(@PathVariable int id)
    {
        return ser.delete(id);
    }

}
