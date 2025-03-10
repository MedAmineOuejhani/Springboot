package tn.esprit.OuejhaniMedAmine4ds3.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Course;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Piste;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Registration;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Skier;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.ICourse;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.IRegistration;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.ISkier;

@AllArgsConstructor
@Service
public class RegistrationServiceImpl implements IRegistrationService{
    private IRegistration registrationrepository;
    private ISkier skierrepository;
    private ICourse courserepository;

    @Override
    public Registration addRegistrationAndAssigntoskier(Registration registration,Long numSkier) {
        Skier skier = skierrepository.findById(numSkier).orElse(null);
        registration.setSkier(skier);
        return registrationrepository.save(registration);
    }

    @Override
    public Registration AssignRegistrationtocourse(Long numRegistration, Long numCourse) {
        Registration registration=registrationrepository.findById(numRegistration).orElse(null);
        Course course=courserepository.findById(numCourse).orElse(null);

        registration.setCourse(course);
        return registrationrepository.save(registration);
    }


}
