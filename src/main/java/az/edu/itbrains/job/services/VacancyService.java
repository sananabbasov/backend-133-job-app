package az.edu.itbrains.job.services;

import az.edu.itbrains.job.dtos.vacancy.VacancyDetailDto;
import az.edu.itbrains.job.dtos.vacancy.VacancyListDto;
import az.edu.itbrains.job.payloads.PaginationPayload;

import java.util.List;

public interface VacancyService {
    PaginationPayload<VacancyListDto> getAll(Integer currentPage);
    VacancyDetailDto getDetailById(Long id);
}
