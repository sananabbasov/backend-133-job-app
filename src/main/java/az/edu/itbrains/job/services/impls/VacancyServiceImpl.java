package az.edu.itbrains.job.services.impls;

import az.edu.itbrains.job.dtos.vacancy.VacancyDetailDto;
import az.edu.itbrains.job.dtos.vacancy.VacancyListDto;
import az.edu.itbrains.job.models.Vacancy;
import az.edu.itbrains.job.payloads.PaginationPayload;
import az.edu.itbrains.job.repositories.VacancyRepository;
import az.edu.itbrains.job.services.VacancyService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class VacancyServiceImpl implements VacancyService {

    private final VacancyRepository vacancyRepository;
    private final ModelMapper modelMapper;

    @Override
    public PaginationPayload<VacancyListDto> getAll(Integer currentPage) {
        currentPage = currentPage == null ? 1 : currentPage;

        Pageable sortedByPriceDesc =
                PageRequest.of(currentPage-1, 5, Sort.by("id").descending());
        Page<Vacancy> pageable = vacancyRepository.findAll(sortedByPriceDesc);


        List<VacancyListDto> vacancyListDtoList = pageable.getContent().stream().map(vacancy -> modelMapper.map(vacancy, VacancyListDto.class )).toList();



        return new PaginationPayload<>(vacancyListDtoList,pageable.getTotalPages(), currentPage);
    }

    @Override
    public VacancyDetailDto getDetailById(Long id) {
        Vacancy vacancy = vacancyRepository.findById(id).orElseThrow();
        VacancyDetailDto vacancyDetailDto = modelMapper.map(vacancy, VacancyDetailDto.class);
        return vacancyDetailDto;
    }


}
