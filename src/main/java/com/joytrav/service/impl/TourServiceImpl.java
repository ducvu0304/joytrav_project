package com.joytrav.service.impl;

import com.joytrav.model.Tour;
import com.joytrav.repository.TouRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TourServiceImpl implements com.joytrav.service.TourService {

    @Autowired
    private TouRepository touRepository;

    @Override
    public List<Tour> fetchALl() {
        return touRepository.findAll();
    }

    @Override
    public List<Tour> fetchCarouselList() {
        List<Tour> carouselList =
                touRepository
                        .findAll()
                        .stream()
                        .filter(tour -> tour.getSale().equals("30")).collect(Collectors.toList());
        return carouselList;
    }

    @Override
    public Tour getById(Integer integer) {
        return null;
    }

    @Override
    public void create(Tour tour) {

    }

    @Override
    public void save() {

    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }


}
