package az.edu.itbrains.job.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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


    @ManyToOne // FOREIGN KEY (category_id) REFERENCES categories(id)
    private Category category; // category_id
}
