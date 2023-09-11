package com.ghofranjdaradkh.songer.controller;

import com.ghofranjdaradkh.songer.Exception.AlbumNotFound;
import com.ghofranjdaradkh.songer.Repositroy.AlbumsRepository;
import com.ghofranjdaradkh.songer.Repositroy.songRepository;
import com.ghofranjdaradkh.songer.models.Album;
import com.ghofranjdaradkh.songer.models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class songsController {


    @Autowired
    AlbumsRepository albumsRepository;
    @Autowired
    songRepository songRepository;


    @PostMapping("/addSong")
    public String addSong(String title, int length, int trackNumber, Long albumId, Model model) {
        Album album = albumsRepository.findById(albumId)
                .orElseThrow(() -> new AlbumNotFound("Album could not be found"));

        Song song = new Song(title, length, trackNumber, album);
        songRepository.save(song);

        model.addAttribute("album", album);
        List<Song> songs = songRepository.findByAlbum(album);
        model.addAttribute("songs", songs);


        return "song";
    }


    @GetMapping("/addSongForm")
    public String displayAddSongForm() {
        return "song";
    }

    @DeleteMapping("/song/delete/{id}")
    public RedirectView deleteSong(@PathVariable Long id, Model model) {
        songRepository.deleteById(id);
       return  new RedirectView("/addSong");
    }

    }



