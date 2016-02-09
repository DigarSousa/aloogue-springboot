package com.aloogue.service;

import com.aloogue.model.file.PictureFile;
import com.aloogue.model.file.PictureFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PictureProfileService {
    @Autowired
    private PictureFileRepository pictureFileRepository;

    public PictureFile getPictureByUser(Long id) {
        return pictureFileRepository.findOne(id);
    }
}
