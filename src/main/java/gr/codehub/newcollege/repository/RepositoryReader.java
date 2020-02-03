package gr.codehub.newcollege.repository;

import gr.codehub.newcollege.model.College;
import gr.codehub.newcollege.model.Course;
import gr.codehub.newcollege.model.Student;

import java.util.List;

public class RepositoryReader {

    public College readRepository() {
        CollegeReader collegeReader = new CollegeReader();
        College college = collegeReader.readCollegeData();

        StudentReader studentReader = new StudentReader();
        List<Student> students = studentReader.readAllStudentData();
        college.setStudents(students);
        
        CourseReader courseReader = new CourseReader();
        List<Course> courses = courseReader.readAllCourseData();

        college.setCourses(courses);
        college.setStudents(students);
        //college.getCourses().addAll(courses);
        return college;
    }
}
