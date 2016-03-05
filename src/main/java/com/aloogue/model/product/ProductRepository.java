package com.aloogue.model.product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    @Query("Select distinct p from Product p where p.place.id=?1")
    Iterable<Product> findByPlace(Long idPlace);
}
