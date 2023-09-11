package com.ghofranjdaradkh.songer.Repositroy;

import com.ghofranjdaradkh.songer.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepository extends JpaRepository <Album, Long> {

//    Album findByTitle(String title );

}
