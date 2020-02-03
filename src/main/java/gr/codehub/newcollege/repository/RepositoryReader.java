package gr.codehub.newcollege.repository;

import gr.codehub.newcollege.model.College;
import gr.codehub.newcollege.model.Course;
import gr.codehub.newcollege.model.Student;

import java.util.List;

public class RepositoryReader {

    public College readRepository() {
        CollegeReader collegeReader = new CollegeReader();
        College college = collegeReader.readCollegeData();

        CourseReader courseReader = new CourseReader();
        List<Course> courses = courseReader.readAllCourseData();

        StudentReader studentReader = new StudentReader();
        List<Student> students = studentReader.readAllStudentData();

        college.setCourses(courses);
        college.setStudents(students);
        //college.getCourses().addAll(courses);
        return college;
    }
}
