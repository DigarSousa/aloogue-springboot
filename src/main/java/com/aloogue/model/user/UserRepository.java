package com.aloogue.model.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by edgar on 03/01/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    java.util.List<User> findByEmail(@Param("email") String email);
}
