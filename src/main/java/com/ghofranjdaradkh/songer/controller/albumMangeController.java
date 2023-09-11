package com.ghofranjdaradkh.songer.controller;

import com.ghofranjdaradkh.songer.Repositroy.AlbumsRepository;
import com.ghofranjdaradkh.songer.models.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class albumMangeController {

    @Autowired
    private AlbumsRepository albumRepository;

    @GetMapping("/new")
    public String displayAlbums(Model model) {
        List<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);

        ;
        return "albums";
    }

    @GetMapping("/addAlbumForm")
    public String displayAddAlbumForm() {
        return "albums";
    }


    @PostMapping("/newAlbum")
    public RedirectView addAlbum(Album album) {
        albumRepository.save(album);
        return new RedirectView("/new");
    }

//    @DeleteMapping("/delete/{delAlbum}")
//    public RedirectView deleteAlbums(@PathVariable Long delAlbum)
//    {
//        albumRepository.deleteById(delAlbum);
//        return new RedirectView("/new");
//    }
//    }

//    @DeleteMapping("/delete/{delAlbum}")
//    public RedirectView deleteAlbums(@PathVariable Long delAlbum) {
//        albumRepository.deleteById(delAlbum);
//        return new RedirectView("/new");
//    }

    @PostMapping("/album/delete/{id}")
    public String deleteAlbum(@PathVariable Long id, Model model) {
        albumRepository.deleteById(id);
        return "redirect:/new"; // Redirect to the correct endpoint
    }
}


