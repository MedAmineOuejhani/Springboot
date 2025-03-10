package tn.esprit.OuejhaniMedAmine4ds3.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Course;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Piste;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Registration;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Skier;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.IPisteRepository;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.ISkier;

import java.util.List;
@AllArgsConstructor
@Service
public class SkierServiceImpl implements ISkierService{


    private ISkier skierrepository;


    @Override
    public Skier addSkier(Skier skier) {
        return skierrepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierrepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        return skierrepository.findById(numSkier).orElse(null);
    }

    @Override
    public void removeSkier(Long numSkier) {
    skierrepository.deleteById(numSkier);
    }

    @Override
    public List<Skier> retrieveAll() {
        return skierrepository.findAll();
    }

    @Override
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse) {

    }


}
