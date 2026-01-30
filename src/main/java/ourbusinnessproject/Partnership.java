package ourbusinnessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class Partnership {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private Date datecrea;
    @NotNull
    @OneToOne
    private Enterprise enterprise;
    @NotNull
    @OneToOne
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

    public Object getId() {
        return id;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public Project getProject() {
        return project;
    }

    public Object getCreationDate() {
        return datecrea;
    }
}
