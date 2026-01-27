package ourbusinnessproject;

import jakarta.validation.constraints.*;

public class Enterprise {
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

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }
}
