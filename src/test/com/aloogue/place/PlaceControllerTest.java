package com.aloogue.place;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PlaceControllerTest {

    @Mock
    private PlaceService placeService;

    @InjectMocks
    private PlaceController placeController;

    @Test
    public void savePlace() {
        Place placeToSave = Place.builder().name("toolstore").id(1L).build();
        when(placeService.savePlace(placeToSave)).thenReturn(placeToSave);

        Place savedPlace = placeController.savePlace(placeToSave);

        assertThat(savedPlace).isNotNull();
        assertThat(savedPlace.getId()).isEqualTo(1L);
    }

}
