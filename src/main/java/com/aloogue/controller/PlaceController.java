package com.aloogue.controller;

import com.aloogue.model.place.Place;
import com.aloogue.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "place")
public class PlaceController {
    @Autowired
    private PlaceService placeService;

    @RequestMapping(method = RequestMethod.GET)
    public Place getPlace(@RequestParam Long id) {
        return placeService.getPlace(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Place savePlace(@RequestBody Place  place) {
        return placeService.savePlace(place);
    }
}
