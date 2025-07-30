package az.edu.itbrains.job.repositories;

import az.edu.itbrains.job.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
