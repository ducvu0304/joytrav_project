package com.joytrav.repository;

import com.joytrav.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tourRepository")
public interface TouRepository extends JpaRepository<Tour, Integer> {
}
