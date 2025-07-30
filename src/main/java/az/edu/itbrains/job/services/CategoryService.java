package az.edu.itbrains.job.services;

import az.edu.itbrains.job.dtos.category.CategoryExploreDto;
import az.edu.itbrains.job.models.Category;

import java.util.List;

public interface CategoryService {
    List<CategoryExploreDto> getExploreCategories();
}
