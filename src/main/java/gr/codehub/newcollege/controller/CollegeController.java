package gr.codehub.newcollege.controller;

import gr.codehub.newcollege.model.Course;
import gr.codehub.newcollege.model.Student;
import gr.codehub.newcollege.service.CollegeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollegeController {

    private CollegeService collegeService;

    public CollegeController(){
        collegeService = new CollegeService();
    }

    @GetMapping("courses")
    public List<Course> getCourses() {
        List<Course> courses = new CollegeService().getCourses();
        return courses;
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        List<Student> students = new CollegeService().getStudents();
        return students;
    }
}
