package ourbusinnessproject;

import jakarta.validation.constraints.NotBlank;


public class Project {
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
