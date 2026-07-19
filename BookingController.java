package org.project.poolmate.controller;

import org.project.poolmate.entity.BookingEntity;
import org.project.poolmate.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {
    @Autowired
    BookingService ser;
    @PostMapping("/joinRide")
    public String book(@RequestBody BookingEntity book)
    {
        return ser.joinRide(book);
    }

    @GetMapping("/rides/{userId}")
    public List<BookingEntity> rides(@PathVariable int id)
    {
        return ser.getRides(id);
    }
    @DeleteMapping("cancleBooking/{id}")
    public String canclebooking(@PathVariable int id) {
        return ser.canclebooking(id);
    }
}
