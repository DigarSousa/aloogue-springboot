package com.aloogue.controller;

import com.aloogue.model.place.Place;
import com.aloogue.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "place")
public class PlaceController {
    @Autowired
    private PlaceService placeService;

    @RequestMapping(method = RequestMethod.GET)
    public Place getPlace(@RequestParam Long userId) {
        return placeService.getPlace(userId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Place savePlace(@RequestBody Place place) {
        return placeService.savePlace(place);
    }

    @RequestMapping(value = "/around", method = RequestMethod.GET)
    public Iterable<Place> findPlacesAround(@RequestParam String description, @RequestParam Double latitude, @RequestParam Double longitude, @RequestParam Double distance) {
        return placeService.findPlacesAround(description, latitude, longitude, distance);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity deletePlace(@RequestBody Place place) {
        return placeService.deletePlace(place);
    }
}

