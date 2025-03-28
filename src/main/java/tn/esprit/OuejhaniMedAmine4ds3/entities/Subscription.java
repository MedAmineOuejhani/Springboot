package tn.esprit.OuejhaniMedAmine4ds3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.time.LocalDate;
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSub;
    LocalDate startDate;
    LocalDate endDate;
    float price;
    @Enumerated(EnumType.STRING)
    TypeSubscription typeSub;

}
