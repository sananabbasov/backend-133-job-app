package az.edu.itbrains.job.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vacancies")
public class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 700)
    private String description;
    @Column(length = 700)
    private String responsibility;
    @Column(length = 700)
    private String qualification;
    private String location;
    private int minSalary;
    private int maxSalary;
    private Date dateLine;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Company company;

    @ManyToOne
    private JobType jobType;
}
