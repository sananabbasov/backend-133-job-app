package az.edu.itbrains.job.repositories;

import az.edu.itbrains.job.models.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacancyRepository extends JpaRepository<Vacancy, Long> {
}
