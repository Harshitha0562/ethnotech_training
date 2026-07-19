package org.project.poolmate.service;

import org.project.poolmate.entity.BookingEntity;
import org.project.poolmate.entity.RideEntity;
import org.project.poolmate.repo.BookingRepo;
import org.project.poolmate.repo.RideRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingRepo repo;
    @Autowired
    RideRepo rideRepo;
    public String joinRide(BookingEntity book)
    {
        RideEntity ride=rideRepo.findById(book.getRideId()).orElse(null);
        if(ride==null)
        {
            return "ride not found";
        }
        if(ride.getAvailableSeats()>=book.getSeatsBooked())
        {
            ride.setAvailableSeats(ride.getAvailableSeats()-book.getSeatsBooked());
            rideRepo.save(ride);
            repo.save(book);
            return "Booked successfully";
        }
        return "Seats are not available";
    }
    public List<BookingEntity> getRides(int id)
    {
        return repo.findByUserId(id);
    }
    public String canclebooking(int id)
    {
        BookingEntity booked=repo.findById(id).orElse(null);
        if(booked==null)
        {
            return "not booked";
        }
        RideEntity ride=rideRepo.findById(booked.getRideId()).orElse(null);
        if(ride!=null) {
            ride.setAvailableSeats(ride.getAvailableSeats() + booked.getSeatsBooked());
            rideRepo.save(ride);
        }
        repo.deleteById(id);
        return "Booking cancelled successfully";
    }
}
