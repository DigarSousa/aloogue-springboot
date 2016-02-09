package com.aloogue.model.file;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureFileRepository extends CrudRepository<PictureFile, Long> {

}
