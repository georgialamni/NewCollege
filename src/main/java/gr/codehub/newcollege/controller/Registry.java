package gr.codehub.newcollege.controller;

import gr.codehub.newcollege.model.College;

public class Registry {

    private static College college;

    static {
        college = new College(); //constructor 
    }
}
