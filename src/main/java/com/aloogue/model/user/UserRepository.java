package com.aloogue.model.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by edgar on 03/01/16.
 */
@Repository
public interface UserRepository extends CrudRepository<Usuario, Integer> {
    java.util.List<Usuario> findByEmail(@Param("email") String email);
}
