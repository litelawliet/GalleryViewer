package com.cyclopean.studio.gallery_viewer.dto;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GalleryViewer")
public class PictureDTO {

    @Getter
    @Setter
    @Id
    String uid;

    @Getter
    @Setter
    String path;

    @Getter
    @Setter
    String name;
}
