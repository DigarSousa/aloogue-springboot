package com.aloogue.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserApp, Long> {
    Object findByEmail(@Param("email") String email);

    Object findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
