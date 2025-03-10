package tn.esprit.OuejhaniMedAmine4ds3.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Instructor;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Registration;
import tn.esprit.OuejhaniMedAmine4ds3.service.IInstructorService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("instructor")
public class InstructorController {

    private IInstructorService instructorService;

    @GetMapping("all")
    public List<Instructor> retrieveAll(){
        return instructorService.retrieveAll();
    }


    @PostMapping("add")
    Instructor addCourse(@RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }

    @PutMapping("update")
    Instructor updateCourse(@RequestBody Instructor instructor) {
        return instructorService.updateInstructor(instructor);
    }

    @GetMapping("get/{numInstructor}")
    Instructor retrieveCourse(@PathVariable Long numInstructor) {return instructorService.retrieveInstructor(numInstructor);
    }

    @DeleteMapping("remove/{numInstructor}")
    void removeCourse(@PathVariable Long numInstructor) {
        instructorService.removeInstructor(numInstructor);
    }

    @PostMapping("add/{numCourse}")
    public Instructor addInstructorAndAssignToCourse(@RequestBody Instructor Instructor, @PathVariable Long numCourse) {
        return instructorService.addInstructorAndAssignToCourse(Instructor,numCourse);
    }
}
