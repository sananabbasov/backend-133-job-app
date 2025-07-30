package az.edu.itbrains.job.services.impls;

import az.edu.itbrains.job.dtos.category.CategoryExploreDto;
import az.edu.itbrains.job.models.Category;
import az.edu.itbrains.job.repositories.CategoryRepository;
import az.edu.itbrains.job.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public List<CategoryExploreDto> getExploreCategories() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryExploreDto> categoryExploreDtoList = categories.stream().map(category -> new CategoryExploreDto(category.getId(), category.getIcon(), category.getName(),category.getVacancies().size())).toList();
        return categoryExploreDtoList;
    }
}
