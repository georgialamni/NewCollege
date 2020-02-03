package gr.codehub.newcollege.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Module {

    private String name;
    private List<Attendance> attendances;

    public Module() {
        attendances = new ArrayList<>();
    }
}
