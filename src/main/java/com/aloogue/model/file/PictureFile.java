package com.aloogue.model.file;

import com.aloogue.model.user.UserApp;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="picture_file")
public class PictureFile {

    @Id
    @Column(name = "id_file")
    @GeneratedValue
    private Long id;

    @Column(name = "source_file")
    private byte[] sourceFile;

    @OneToOne(targetEntity = UserApp.class)
    @JoinColumn(name = "id_user_app")
    private UserApp userApp;
}
