package com.aloogue.model.place;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends CrudRepository<Place, Long> {

    @Query("select p from Place p where p.userApp.id=?1")
    Place findByUserAppId(Long id);
}
