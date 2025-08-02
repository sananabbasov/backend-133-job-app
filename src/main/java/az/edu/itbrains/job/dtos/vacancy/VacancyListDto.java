package az.edu.itbrains.job.dtos.vacancy;


import az.edu.itbrains.job.dtos.company.CompanyDto;
import az.edu.itbrains.job.dtos.jobType.JobTypeDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VacancyListDto {
    private Long id;
    private String title;
    private String location;
    private int minSalary;
    private int maxSalary;
    private Date dateLine;
    private JobTypeDto jobType;
    private CompanyDto company;
}
