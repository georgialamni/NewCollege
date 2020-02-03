package gr.codehub.newcollege.service;

import gr.codehub.newcollege.model.College;
import gr.codehub.newcollege.model.Course;
import gr.codehub.newcollege.model.Student;
import gr.codehub.newcollege.repository.RepositoryReader;

import java.util.List;

public class CollegeService {

    public List<Course> getCourses() {

        RepositoryReader repositoryReader = new RepositoryReader();
        College college = repositoryReader.readRepository();
        return college.getCourses();
    }

    public List<Student> getStudents() {

        RepositoryReader repositoryReader = new RepositoryReader();
        College college = repositoryReader.readRepository();
        return college.getStudents();
    }
}
