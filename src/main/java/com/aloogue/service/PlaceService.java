package com.aloogue.service;

import com.aloogue.model.place.Place;
import com.aloogue.model.place.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlaceService {
    @Autowired
    private PlaceRepository placeRepository;

    public Place getPlace(Long userId) {
        return placeRepository.findByUserAppId(userId);

    }

    public Place savePlace(Place place) {
        return placeRepository.save(place);
    }

    public Iterable<Place> findPlacesAround(String description,Double latitude, Double longitude, Double distance) {
        return placeRepository.findPlaceByDistance(description,latitude, longitude, distance);
    }
}
