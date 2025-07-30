package az.edu.itbrains.job.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class JobsController {


    @GetMapping("/jobs") // localhost:8080/jobs
    public String jobs(){
        return "jobs.html";
    }


    @GetMapping("/job/detail/{id}") // localhost:8080/job/detail/?
    public String detail(@PathVariable Long id){
        return "detail.html";
    }
}
