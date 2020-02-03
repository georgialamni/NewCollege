package gr.codehub.newcollege.repository;

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

    public List<Attendance> readAllAttendanceData(List<Student> students, List<Module> modules) {
        List<Attendance> attendances = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Student student = students.get(Util.randomInt(0, students.size() - 1));
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
