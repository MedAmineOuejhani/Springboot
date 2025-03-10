package tn.esprit.OuejhaniMedAmine4ds3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numCourse;
    int level;
    @Enumerated(EnumType.STRING)
    TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    Support support;
    float price;
    int timeSlot;
    @OneToMany(mappedBy = "course")
    Set<Registration> registrations;


}
