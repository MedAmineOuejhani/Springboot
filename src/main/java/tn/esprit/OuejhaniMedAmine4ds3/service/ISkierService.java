package tn.esprit.OuejhaniMedAmine4ds3.service;

import tn.esprit.OuejhaniMedAmine4ds3.entities.Skier;
import tn.esprit.OuejhaniMedAmine4ds3.entities.TypeSubscription;

import java.util.List;

public interface ISkierService {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    Skier retrieveSkier(Long numSkier);
    void removeSkier(Long numSkier);
    List<Skier> retrieveAll();
    Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);
    List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeAbonnement);
}
