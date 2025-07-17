package az.edu.itbrains.job.controllers;


import az.edu.itbrains.job.models.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/about")
    public String about(){

        Test test = new Test();
        return "about.html";
    }
}
