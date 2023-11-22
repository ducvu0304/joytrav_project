package com.joytrav.service;

import com.joytrav.model.Tour;

import java.util.List;

public interface TourService extends IGenericService<Tour, Integer> {

    List<Tour> fetchCarouselList();
}
