package com.aloogue.product;

import com.aloogue.place.Place;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    @Query("Select distinct p from Product p where p.place.id=?1")
    Iterable<Product> findByPlace(Long idPlace);

    @Modifying
    @Transactional
    @Query("delete from Product p where p.place=?1")
    void deleteByPlace(Place place);
}
