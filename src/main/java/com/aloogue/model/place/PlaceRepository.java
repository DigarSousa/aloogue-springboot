package com.aloogue.model.place;

import com.aloogue.model.user.UserApp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends CrudRepository<Place, Long> {
     Object findByUserApp(@Param("userApp") UserApp userApp);
}
