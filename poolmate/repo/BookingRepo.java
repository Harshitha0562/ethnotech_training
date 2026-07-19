package org.project.poolmate.repo;

import org.project.poolmate.entity.BookingEntity;
import org.project.poolmate.entity.RideEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepo extends JpaRepository<BookingEntity,Integer> {
    public List<BookingEntity> findByUserId(int id);
    public String deleteById(int id);
}
