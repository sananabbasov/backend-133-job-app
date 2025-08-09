package az.edu.itbrains.job.controllers;

import az.edu.itbrains.job.dtos.vacancy.VacancyDetailDto;
import az.edu.itbrains.job.dtos.vacancy.VacancyListDto;
import az.edu.itbrains.job.payloads.PaginationPayload;
import az.edu.itbrains.job.services.VacancyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class JobsController {

    private final VacancyService vacancyService;

    @GetMapping("/jobs") // localhost:8080/jobs
    public String jobs(Model model, Integer currentPage){
        PaginationPayload<VacancyListDto> vacancyListDtoList = vacancyService.getAll(currentPage);
        model.addAttribute("currentPage", currentPage== null ? 1 : currentPage);
        model.addAttribute("vacancies", vacancyListDtoList);
        return "job/jobs.html";
    }


    @GetMapping("/job/detail/{id}") // localhost:8080/job/detail/?
    public String detail(@PathVariable Long id, Model model){
        VacancyDetailDto vacancyDetail = vacancyService.getDetailById(id);
        model.addAttribute("vacancy", vacancyDetail);
        return "job/detail.html";
    }
}
