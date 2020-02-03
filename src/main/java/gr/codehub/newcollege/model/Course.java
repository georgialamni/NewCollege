package gr.codehub.newcollege.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Course {

    private String name;
    private List<Module> modules;

    public Course(){
        modules = new ArrayList<>();
    }
}
