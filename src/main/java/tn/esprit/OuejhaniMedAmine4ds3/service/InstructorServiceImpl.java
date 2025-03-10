package tn.esprit.OuejhaniMedAmine4ds3.service;



import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Course;
import tn.esprit.OuejhaniMedAmine4ds3.entities.Instructor;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.ICourse;
import tn.esprit.OuejhaniMedAmine4ds3.repositories.IInstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class InstructorServiceImpl implements IInstructorService{


    private IInstructor instructorrepository;
    private ICourse courserepository;

    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorrepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorrepository.save(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return instructorrepository.findById(numInstructor).orElse(null);
    }

    @Override
    public void removeInstructor(Long numInstructor) {
        instructorrepository.deleteById(numInstructor);
    }

    @Override
    public List<Instructor> retrieveAll() {
        return instructorrepository.findAll();
    }

    @Override
    public Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse) {
        Course course = courserepository.findById(numCourse).orElse(null);
        if (instructor.getCourses() != null) {
            instructor.getCourses().add(course);
        }
        else
        {
            Set<Course> courses = new HashSet<>();
            courses.add(course);
            instructor.setCourses(courses);
        }
        return instructorrepository.save(instructor);
    }
}
