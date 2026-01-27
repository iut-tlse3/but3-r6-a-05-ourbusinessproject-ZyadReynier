package ourbusinnessproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

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

    public Long getId() {
        return id;
    }
}
