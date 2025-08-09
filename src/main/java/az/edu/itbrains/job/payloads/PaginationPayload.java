package az.edu.itbrains.job.payloads;

import az.edu.itbrains.job.models.Vacancy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaginationPayload<TModel> {
    private List<TModel> models;
    private Integer totalPage;
    private Integer currentPage;
}
