package tn.esprit.OuejhaniMedAmine4ds3.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Course;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.ICourse;

import java.util.List;
@AllArgsConstructor
@Service
public class CourseServiceImpl implements ICourseService {


    private ICourse courserepository;

    @Override
    public Course addCourse(Course course) {
        return courserepository.save(course) ;
    }

    @Override
    public Course updateCourse(Course course) {
        return courserepository.save(course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        return courserepository.findById(numCourse).orElse(null);
    }

    @Override
    public void removeCourse(Long numCourse) {
        courserepository.deleteById(numCourse);
    }

    @Override
    public List<Course> retrieveAll() {
        return courserepository.findAll();
    }
}
