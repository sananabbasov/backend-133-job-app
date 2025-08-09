package az.edu.itbrains.job.dtos.vacancy;

import az.edu.itbrains.job.dtos.category.CategoryVacancyDetailDto;
import az.edu.itbrains.job.dtos.company.CompanyDto;
import az.edu.itbrains.job.dtos.jobType.JobTypeDto;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VacancyDetailDto {
    private String title;
    private String description;
    private String responsibility;
    private String qualification;
    private String location;
    private int minSalary;
    private int maxSalary;
    private Date dateLine;
    private CategoryVacancyDetailDto category;
    private JobTypeDto jobType;
    private CompanyDto company;
}
