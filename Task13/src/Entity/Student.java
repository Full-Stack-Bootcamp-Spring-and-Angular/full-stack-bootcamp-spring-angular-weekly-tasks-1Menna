package Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name="student_name")
    private String student_name;

    @ManyToMany
    @JoinTable(
        name="course_student",
        joinColumns = @JoinColumn(name="student_id"),
        inverseJoinColumns = @JoinColumn(name="course_id")
    )
    List<Course> courses;


    public Student(String student_name) {
        this.student_name = student_name;
    }
}
