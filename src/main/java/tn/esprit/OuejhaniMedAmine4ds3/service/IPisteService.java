package tn.esprit.OuejhaniMedAmine4ds3.service;

import tn.esprit.OuejhaniMedAmine4ds3.entities.Color;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Piste;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    Piste retrievePiste(Long numPiste);
    void removePiste(Long numPiste);
    List<Piste> retrieveAll();
    Piste assignPisteToSkier(Long numPiste,Long numSkier);

    List<Piste> retrieveAllByColor(Color color);
}
