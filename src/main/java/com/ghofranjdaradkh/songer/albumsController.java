
package com.ghofranjdaradkh.songer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.List;
@Controller
//annotation used to  handle HTTP requests
public class albumsController {

    //annotation is used to map a specific HTTP GET request
    @GetMapping("/albums")
    public String albums(Model model) {

        List<Album> Albums = new ArrayList<>();
        Albums.add(new Album("album1", "Alix", 4, 450, "https://media.istockphoto.com/id/1144547914/photo/singer-microphone-vocal-talent-music-show-recital.jpg?s=612x612&w=0&k=20&c=VVA_ZmY34qLo9xE9nwB-hXLPJDl8rCmgvh25yO3-xYs="));
        Albums.add(new Album("album2", "sam", 2, 350, "https://images.unsplash.com/photo-1623517272043-cae1572afc96?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE0fHx8ZW58MHx8fHx8&w=1000&q=80"));
        Albums.add(new Album("album3", "katren", 3, 400, "https://media.istockphoto.com/id/1160645050/photo/silhouette-of-woman-with-microphone-singing-on-concert-stage-in-front-of-crowd.jpg?s=612x612&w=0&k=20&c=RdUWFj7Wa76rmHqobtDm1XflUFMDQ1dbZyz4wyQATxY="));


        // allows you to pass the list of albums to the view template so that it can be rendered.
        model.addAttribute("albums", Albums);


        return "albums";
    }


    }








