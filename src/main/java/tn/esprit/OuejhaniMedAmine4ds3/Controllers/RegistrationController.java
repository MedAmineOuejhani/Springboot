package tn.esprit.OuejhaniMedAmine4ds3.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Registration;
import tn.esprit.OuejhaniMedAmine4ds3.service.IRegistrationService;

@RestController
@AllArgsConstructor
@RequestMapping("registration")
public class RegistrationController {

    private IRegistrationService registrationservice;

    @PostMapping("add/{numSkier}")
    public Registration addRegistrationAndAssigntoskier(@RequestBody Registration registration,@PathVariable Long numSkier) {
        return registrationservice.addRegistrationAndAssigntoskier(registration,numSkier);
    }


    @PutMapping("add/{numRegistration}/{numCourse}")
    public Registration AssignRegistrationtocourse(@PathVariable Long numRegistration,@PathVariable Long numCourse) {
        return registrationservice.AssignRegistrationtocourse(numRegistration,numCourse);
    }
}
