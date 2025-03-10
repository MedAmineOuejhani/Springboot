package tn.esprit.OuejhaniMedAmine4ds3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Color;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Piste;

import java.util.List;
import java.util.Optional;

public interface IPisteRepository  extends JpaRepository<Piste,Long> {

    List<Piste> findByColor(Color color);

    List<Piste> findByNamePisteAndColor(String name,Color color);
}
