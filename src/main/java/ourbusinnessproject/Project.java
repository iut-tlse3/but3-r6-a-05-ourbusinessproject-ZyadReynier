package ourbusinnessproject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Collection;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @NotBlank
    private String title;
    private  String description;

    @ManyToOne
    @NotNull
    private Enterprise enterprise;

    public Project(){
    }

    /**
     * Set the title of the project
     * @param title String that define the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Set the description of the project
     * @param description String that describes the project
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return description of the project
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @return title of the project
     */
    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    /**
     * Set the Enterprise where the project is
     * @param enterprise the object Enterprise
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    /**
     *
     * @return the Enterprise where the project is
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }
}
