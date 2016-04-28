package com.aloogue.model.place;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends CrudRepository<Place, Long> {

    @Query("select p from Place p where p.userApp.id=?1")
    Place findByUserAppId(Long id);

    @Query("   SELECT distinct p from Product product"
            +" JOIN product.place p"
            +" JOIN p.address a"
            +" WHERE "
            +"  product.description LIKE CONCAT('%',?1,'%') "
            +" AND ACOS(COS( RADIANS( a.latitude ) ) * COS( RADIANS(?2)) "
            +"  * COS( RADIANS( a.longitude ) - RADIANS(?3)) "
            +"  + SIN( RADIANS( a.latitude ) ) * SIN( RADIANS(?2) ) ) * 6378 <= ?4 ")
    Iterable<Place> findPlaceByDistance(String description, Double latitude, Double longitude, Double distance);
}
