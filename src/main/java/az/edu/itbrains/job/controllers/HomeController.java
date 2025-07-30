package az.edu.itbrains.job.controllers;


import az.edu.itbrains.job.dtos.category.CategoryExploreDto;
import az.edu.itbrains.job.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {


    private final CategoryService categoryService;

    public HomeController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/")
    public String index(Model model){
        List<CategoryExploreDto> exploreCategories = categoryService.getExploreCategories();
        model.addAttribute("exploreCategories",exploreCategories);
        return "index.html";
    }

    @GetMapping("/about")
    public String about(){
        return "about.html";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact.html";
    }
}
