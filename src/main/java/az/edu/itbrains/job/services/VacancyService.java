package az.edu.itbrains.job.services;

import az.edu.itbrains.job.dtos.vacancy.VacancyListDto;

import java.util.List;

public interface VacancyService {
    List<VacancyListDto> getAll();
}
