package tn.esprit.OuejhaniMedAmine4ds3.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Course;
import tn.esprit.OuejhaniMedAmine4ds3.service.ICourseService;

import java.util.List;

@RestController
@RequestMapping("course")
@AllArgsConstructor
public class CourseController {


    private ICourseService courseService;

    @GetMapping("all")
    public List<Course> retrieveAll(){
        return courseService.retrieveAll();
    }


    @PostMapping("add")
    Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("update")
    Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @GetMapping("get/{numCourse}")
    Course retrieveCourse(@PathVariable Long numCourse) {
        return courseService.retrieveCourse(numCourse);
    }

    @DeleteMapping("remove/{numCourse}")
    void removeCourse(@PathVariable Long numCourse) {
        courseService.removeCourse(numCourse);
    }
}
