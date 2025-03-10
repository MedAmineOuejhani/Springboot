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
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSkier ;
    String firstName;
    String lastName ;
    LocalDate dateOfBirth;
    String city;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    Subscription subscription ;
    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;
    @ManyToMany(mappedBy = "skiers")
    private Set<Piste> pistes;


}
