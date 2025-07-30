package az.edu.itbrains.job.dtos.category;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryExploreDto {
    private Long id;
    private String icon;
    private String name;
    private long vacancyCount;
}
