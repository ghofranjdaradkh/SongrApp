package com.ghofranjdaradkh.songer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class albumMangeController {

    @Autowired
    private AlbumsRepository albumRepository;

    @GetMapping("/new")
    public String displayAlbums(Model model) {
        List<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        List<Album> allAlbums = new ArrayList<>(albums);
        model.addAttribute("allAlbums", allAlbums);
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

    @PostMapping("/deleteAlbum/{id}")
    public RedirectView deleteAlbum(@RequestParam("id") Long id) {
        albumRepository.deleteById(id);
        return new RedirectView("/new");
    }

}
