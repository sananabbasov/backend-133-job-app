package az.edu.itbrains.job.repositories;

import az.edu.itbrains.job.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository  extends JpaRepository<Company, Long> {
}
