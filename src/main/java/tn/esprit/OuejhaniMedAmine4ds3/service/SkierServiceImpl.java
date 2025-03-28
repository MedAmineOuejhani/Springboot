package tn.esprit.OuejhaniMedAmine4ds3.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.OuejhaniMedAmine4ds3.entities.*;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.ICourse;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.IRegistration;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.ISkier;

import java.util.List;
@AllArgsConstructor
@Service
public class SkierServiceImpl implements ISkierService{


    private ISkier skierrepository;
    private ICourse courserepository;

    private IRegistration registrationrepository;

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
        Course course = courserepository.findById(numCourse).orElse(null);
        skier = skierrepository.save(skier);

        // Create and save the registration
        Registration registration = new Registration();
        registration.setSkier(skier);
        registration.setCourse(course);
        registrationrepository.save(registration);

        return skier;
    }

    @Override
    public List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeAbonnement) {
        return skierrepository.findSkierBySubscription_TypeSub(typeAbonnement);
    }


}
