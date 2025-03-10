package tn.esprit.OuejhaniMedAmine4ds3.service;

import tn.esprit.OuejhaniMedAmine4ds3.entities.Registration;

public interface IRegistrationService{

     Registration addRegistrationAndAssigntoskier(Registration registration,Long numSkier);
     Registration AssignRegistrationtocourse(Long numRegistration,Long numCourse);
}
