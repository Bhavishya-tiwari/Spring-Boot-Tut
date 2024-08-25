package com.example.sbtut1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    String home(Model model){
        model.addAttribute("data", "This is the data from controller");

        return "people";
    }
}
