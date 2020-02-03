package gr.codehub.newcollege.controller;

import gr.codehub.newcollege.model.College;
import gr.codehub.newcollege.model.Student;
import gr.codehub.newcollege.repository.RepositoryReader;
import gr.codehub.newcollege.util.Util;

import java.util.List;

public class Registry {

    private static College college;

    static {
        college = new College(); //constructor gia static
    }

    public static College getCollege() {
        return college;
    }

    public static Student chooseRandomCollegeStudent() {
        List<Student> students = college.getStudents();
        return students.get(Util.randomInt(0, students.size()));
    }
}
