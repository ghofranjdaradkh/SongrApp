package com.ghofranjdaradkh.songer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {
    //http://localhost:8080/hello
    @GetMapping("/hello")
    public String HelloWorld( Model welcome){
        welcome.addAttribute("words","Hello World");
        return "welcome";

    }

    @GetMapping("/")
    public String splash(){

        return "splashPage";


    }





}
