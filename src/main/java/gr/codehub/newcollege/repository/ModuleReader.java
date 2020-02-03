package gr.codehub.newcollege.repository;

import gr.codehub.newcollege.model.Module;
import gr.codehub.newcollege.util.Util;

import java.util.ArrayList;
import java.util.List;

public class ModuleReader {

    //Calendar c = GregorianCalendar.getInstance(); // registry

    public List<Module> readAllModuleData() {
        List<Module> modules = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Module c = readModuleData();
            modules.add(c);
        }
        return modules;
    }

    public Module readModuleData() {
        Module module = new Module();
        String name = Util.randomName("Module");
        module.setName(name);
        AttendanceReader attendanceReader = new AttendanceReader(module);
        module.setAttendances(attendanceReader.readAllAttendanceData());

        return module;
    }
}
