package com.cyclopean.studio.gallery_viewer.services;

import com.cyclopean.studio.gallery_viewer.dto.PictureDTO;
import com.cyclopean.studio.gallery_viewer.repositories.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PictureService {

    @Autowired
    private PictureRepository repository;

    public Optional<PictureDTO> getPicture(String id){

        return repository.findById(id);
    }

}
