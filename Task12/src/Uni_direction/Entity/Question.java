package Uni_direction.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="question_name")
    private String question_name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="question_id")
    private List<Answer>answers;

    public Question(String question_name) {
        this.question_name = question_name;
    }
}
