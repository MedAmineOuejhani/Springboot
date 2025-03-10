package tn.esprit.OuejhaniMedAmine4ds3.service;


import tn.esprit.OuejhaniMedAmine4ds3.entities.Course;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course course);
    Course updateCourse(Course course);
    Course retrieveCourse(Long numCourse);
    void removeCourse(Long numCourse);
    List<Course> retrieveAll();
}
