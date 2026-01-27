package ourbusinnessproject;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Entreprise {
    @NotNull
    @Size(min = 1)
    private String Name;
    @Size(min = 10)
    private String Description;

    public  Entreprise(){

    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
