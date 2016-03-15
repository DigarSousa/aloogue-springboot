package com.aloogue.model.place;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends CrudRepository<Place, Long> {

    @Query("select p from Place p where p.userApp.id=?1")
    Place findByUserAppId(Long id);

    @Query("SELECT distinct p from Place p "
            + "where "
            + "ACOS (COS( RADIANS( p.latitude ) ) * COS( RADIANS(?1))"
            + " * COS( RADIANS( p.longitude ) - RADIANS(?2))"
            + " + SIN( RADIANS( p.latitude ) ) * SIN( RADIANS(?1) ) ) * 6378 < ?3")
    java.util.List findPlaceByDistance(Double latitude, Double longitude, Double distance);
}
