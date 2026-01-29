package ourbusinnessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Collection;
import java.util.HashSet;


@Entity
public class Enterprise {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String Name;
    @Size(min = 10)
    private String Description;

    @NotNull
    @Size(min = 1)
    private String ContactName;

    @NotBlank
    @Email
    private String ContactEmail;


    @OneToMany(mappedBy = "enterprise")
    private Collection<Project> projects;

    public Enterprise(){
    }

    /**
     * Set the name of the enterprise
     * @param name String that define the name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Set the description of the enterprise
     * @param description String that describes the enterprise
     */
    public void setDescription(String description) {
        Description = description;
    }

    /**
     * Set the Email of the contact in the enterprise
     * @param contactEmail String that define the mail
     */
    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }

    /**
     * Name of the contact in the enterprise
     * @param contactName first and last name of the contact
     */
    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    /**
     *
     * @return mail of the contact
     */
    public String getContactEmail() {
        return ContactEmail;
    }

    /**
     *
     * @return first and last name of the contact
     */
    public String getContactName() {
        return ContactName;
    }

    /**
     * *
     * @return description of the enterprise
     */
    public String getDescription() {
        return Description;
    }

    /**
     *
     * @return name of the enterprise
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @return the id of the Enterprise
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @return the collection of project linked with the Enterprise
     */
    public Collection<Project> getProjects() {
        return projects;
    }

    /**
     * Add a project to link with the Enterprise
     * @param p the project to add
     */
    public void addProject(Project p){
        if(this.projects == null){
            projects = new HashSet<>();
            projects.add(p);
        } else {
            projects.add(p);
        }
    }
}
