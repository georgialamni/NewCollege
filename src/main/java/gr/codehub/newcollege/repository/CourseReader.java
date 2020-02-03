package gr.codehub.newcollege.repository;

import gr.codehub.newcollege.model.Course;
import gr.codehub.newcollege.util.Util;

import java.util.ArrayList;
import java.util.List;

public class CourseReader {

    public List<Course> readAllCourseData() {
        List<Course> courses = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Course c = readCourseData();
            courses.add(c);
        }
        return courses;
    }

    public Course readCourseData() {
        Course course = new Course();
        String name = Util.randomName("Course");
        course.setName(name);
        return course;
    }
}
