package tn.esprit.OuejhaniMedAmine4ds3.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Skier;
import tn.esprit.OuejhaniMedAmine4ds3.service.ISkierService;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("skier")
public class SkierController {

    private ISkierService skierService;

    @GetMapping("all")
    public List<Skier> retrieveAll(){
        return skierService.retrieveAll();
    }


    /*@PostMapping("add")
    Skier addSkier(@RequestBody Skier skier) {
        return skierService.addSkier(skier);
    }*/
    @PostMapping("/add")
    public Skier addSkier(@RequestBody Skier skier) {
        if (skier.getSubscription() != null && skier.getSubscription().getEndDate() == null) {
            LocalDate startDate = skier.getSubscription().getStartDate();  // No need to parse
            if (startDate != null) {
                LocalDate endDate = calculateEndDate(startDate, skier.getSubscription().getTypeSub().toString());
                skier.getSubscription().setEndDate(endDate);
            }
        }
        return skierService.addSkier(skier);
    }

    private LocalDate calculateEndDate(LocalDate startDate, String typeSub) {
        switch (typeSub.toUpperCase()) {
            case "SEMESTRIAL":
                return startDate.plus(6, ChronoUnit.MONTHS);
            case "MONTHLY":
                return startDate.plus(1, ChronoUnit.MONTHS);
            case "ANNUAL":
                return startDate.plus(1, ChronoUnit.YEARS);
            default:
                throw new IllegalArgumentException("Invalid subscription type: " + typeSub);
        }
    }

    @PutMapping("update")
    Skier updateSkier(@RequestBody Skier skier) {
        return skierService.updateSkier(skier);
    }

    @GetMapping("get/{numSkier}")
    Skier retrieveSkier(@PathVariable Long numSkier) {
        return skierService.retrieveSkier(numSkier);
    }

    @DeleteMapping("remove/{numSkier}")
    void removeSkier(@PathVariable Long numSkier) {
        skierService.removeSkier(numSkier);
    }
}
