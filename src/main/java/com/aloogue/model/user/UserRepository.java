package com.aloogue.model.user;

import org.hibernate.mapping.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by edgar on 03/01/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    List findByName(String name);
}
