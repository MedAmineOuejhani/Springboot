package tn.esprit.OuejhaniMedAmine4ds3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numRegistration;
    int numWeek;
    @ManyToOne
    Skier skier;
    @ManyToOne
    Course course;
}
