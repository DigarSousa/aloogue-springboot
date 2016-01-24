package com.aloogue.model.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by edgar on 03/01/16.
 */
@Repository
public interface UserRepository extends CrudRepository<UserApp, Integer> {
    java.util.List<UserApp> findByEmail(@Param("email") String email);

    Object findByLoginCredencials(@Param("email") String email, @Param("password") String password);
}
