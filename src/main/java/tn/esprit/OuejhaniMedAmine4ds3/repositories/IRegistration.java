package tn.esprit.OuejhaniMedAmine4ds3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Registration;


public interface IRegistration extends JpaRepository<Registration,Long> {
}
