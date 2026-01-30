package ourbusinnessproject;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Partnership {
    @NotNull
    private Date datecrea;
    @NotNull
    private Enterprise enterprise;
    @NotNull
    private Project project;

    /**
     * Set the date of creation of the partnership
     * @param date the date of creation
     */
    public void setCreationDate(Date date) {
        datecrea = date;
    }

    /**
     * Set the enterprise which create the partnership
     * @param enterprise the enterprise
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * Set the project of the partnership
     * @param project the project
     */
    public void setProject(Project project) {
        this.project = project;
    }
}
