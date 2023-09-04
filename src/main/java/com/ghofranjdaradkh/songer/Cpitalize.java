package com.ghofranjdaradkh.songer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Cpitalize {

    //http://localhost:8080/capitalize/hello
    @GetMapping("/capitalize/{word}")
    public String capitalize(Model capitalize , @PathVariable String word){
        String capital= word.toUpperCase();
        capitalize.addAttribute("words",capital);
        return "capitalize";

    }

}
