package tn.esprit.OuejhaniMedAmine4ds3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numInstructor;
    String firstName;
    String lastName;
    LocalDate dateOfHire;
    @OneToMany
    Set<Course> courses;
}
