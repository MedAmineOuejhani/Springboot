package tn.esprit.OuejhaniMedAmine4ds3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Skier;
import tn.esprit.OuejhaniMedAmine4ds3.entities.TypeSubscription;

import java.util.List;

public interface ISkier extends JpaRepository<Skier,Long> {
    List<Skier> findSkierBySubscription_TypeSub(TypeSubscription subscriptionTypeSub);
}
