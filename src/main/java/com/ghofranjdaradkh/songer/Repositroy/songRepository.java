package com.ghofranjdaradkh.songer.Repositroy;

import com.ghofranjdaradkh.songer.models.Album;
import com.ghofranjdaradkh.songer.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface songRepository extends JpaRepository<Song,Long> {
    List<Song> findByAlbum(Album album);

}
