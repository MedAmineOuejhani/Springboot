package tn.esprit.OuejhaniMedAmine4ds3.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Color;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Piste;
import tn.esprit.OuejhaniMedAmine4ds3.service.IPisteService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("piste")
public class PisteController {


    private IPisteService pisteService;

    @GetMapping("all")
    public List<Piste> retrieveAll(){
        return pisteService.retrieveAll();
    }


    @PostMapping("add")
    Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }

    @PutMapping("update")
    Piste updatePiste(@RequestBody Piste piste) {
        return pisteService.updatePiste(piste);
    }

    @GetMapping("get/{numPiste}")
    Piste retrievePiste(@PathVariable Long numPiste) {
        return pisteService.retrievePiste(numPiste);
    }

    @DeleteMapping("remove/{numPiste}")
    void removePiste(@PathVariable Long numPiste) {
        pisteService.removePiste(numPiste);
    }

    @GetMapping("color/{color}")
    public List<Piste> retrieveAllByColor(@PathVariable Color color) {
        return pisteService.retrieveAllByColor(color);
    }

    @PutMapping("assigntoskier/{numPiste}/{numSkier}")
    public Piste assignPisteToSkier(@PathVariable Long numPiste,@PathVariable Long numSkier){
      return pisteService.assignPisteToSkier(numPiste,numSkier);
    }

}
