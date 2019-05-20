package com.cyclopean.studio.gallery_viewer.repositories;


import com.cyclopean.studio.gallery_viewer.dto.PictureDTO;
import com.cyclopean.studio.gallery_viewer.entities.Picture;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends MongoRepository<PictureDTO,String> {
}
