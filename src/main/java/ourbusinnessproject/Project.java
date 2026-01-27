package ourbusinnessproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    private String title;
    private  String description;

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
}
