package gr.codehub.newcollege.repository;

import gr.codehub.newcollege.controller.Registry;
import gr.codehub.newcollege.model.College;

public class CollegeReader {

    public College readCollegeData() {
        College c = Registry.getCollege();
        return c;
    }
}
