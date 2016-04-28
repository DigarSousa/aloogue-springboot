package com.aloogue.service;

import com.aloogue.model.place.Place;
import com.aloogue.model.place.PlaceRepository;
import com.aloogue.model.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PlaceService {
    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private ProductRepository productRepository;

    public Place getPlace(Long userId) {
        return placeRepository.findByUserAppId(userId);

    }

    public Place savePlace(Place place) {
        return placeRepository.save(place);
    }

    public Iterable<Place> findPlacesAround(String description, Double latitude, Double longitude, Double distance) {
        return placeRepository.findPlaceByDistance(description, latitude, longitude, distance);
    }

    public ResponseEntity deletePlace(Place place) {

        productRepository.deleteByPlace(place);
        placeRepository.delete(place);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
