package gr.codehub.newcollege.repository;

import gr.codehub.newcollege.controller.Registry;
import gr.codehub.newcollege.model.Attendance;
import gr.codehub.newcollege.model.Mark;
import gr.codehub.newcollege.model.Module;
import gr.codehub.newcollege.model.Student;
import gr.codehub.newcollege.util.Util;

import java.util.ArrayList;
import java.util.List;

public class AttendanceReader {

    private Module module;

    public AttendanceReader(Module module) {
        this.module = module;
    }

    public List<Attendance> readAllAttendanceData() {
        List<Attendance> attendances = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Student student = Registry.chooseRandomCollegeStudent();
            Attendance a = readAttendanceData(student);
            attendances.add(a);
        }
        return attendances;
    }

    public Attendance readAttendanceData(Student student) {
        Attendance attendance = new Attendance();
        Mark mark = new Mark();
        mark.setResult(Util.randomInt(10, 20));
        mark.setMarkTutor("Georgia");

        attendance.setYear(Util.randomInt(2010, 2020));
        attendance.setMark(mark);

        attendance.setStudent(student);

        return attendance;
    }
}
