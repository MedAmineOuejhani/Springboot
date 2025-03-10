package tn.esprit.OuejhaniMedAmine4ds3.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Color;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Piste;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Skier;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.IPisteRepository;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.ISkier;

import java.util.List;

@AllArgsConstructor
@Service
public class PisteServiceImpl implements IPisteService {


    private IPisteRepository pisterepository;
    private ISkier skierrepository;

    @Override
    public Piste addPiste(Piste piste) {
        //traitement
        return pisterepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisterepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisterepository.findById(numPiste).orElse(null);
    }

    @Override
    public void removePiste(Long numPiste) {
        pisterepository.deleteById(numPiste);
    }

    @Override
    public List<Piste>
    retrieveAll() {
        return pisterepository.findAll();
    }

    @Override
    public Piste assignPisteToSkier(Long numPiste, Long numSkier) {
        Piste piste=pisterepository.findById(numPiste).orElse(null);
        Skier skier=skierrepository.findById(numSkier).orElse(null);

        piste.getSkiers().add(skier);
        return pisterepository.save(piste);
    }

    @Override
    public List<Piste> retrieveAllByColor(Color color) {
        return pisterepository.findByColor(color);
    }


}
