package ourbusinnessproject;

import jakarta.persistence.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnterpriseProjectService {

    @PersistenceContext
    private EntityManager entm;

    /**
     * Create a new EnterpriseProjectService initialized with an EntityManager
     * @param entityManager the EntityManager
     */
    public EnterpriseProjectService(EntityManager entityManager) {
        this.entm = entityManager;
    }

    /**
     * Creat a new project
     * @param aTitle the title of the new project
     * @param aDescription the description of the new project
     * @return the created project
     */
    public Project newProject(String aTitle, String aDescription,Enterprise enterprise) {
        Project aproject = new Project();
        aproject.setTitle(aTitle);
        aproject.setDescription(aDescription);
        aproject.setEnterprise(enterprise);
        entm.persist(aproject);
        entm.flush();
        enterprise.addProject(aproject);
        return aproject;
    }

    /**
     *
     * @return the EntityManager of the EnterpriseProjectService
     */
    public EntityManager getEntityManager() {
        return this.entm;
    }

    /**
     * Creat a new Enterprise
     * @param aName the name of the Enterprise
     * @param aDescription the description of the Enterprise
     * @param aContactName the first and last name of the contact in the Enterprise
     * @param mail the mail of the contact in the Enterprise
     * @return the created Enterprise
     */
    public Enterprise newEnterprise(String aName, String aDescription, String aContactName, String mail) {
        Enterprise aenterprise = new Enterprise();
        aenterprise.setName(aName);
        aenterprise.setDescription(aDescription);
        aenterprise.setContactName(aContactName);
        aenterprise.setContactEmail(mail);
        entm.persist(aenterprise);
        entm.flush();
        return aenterprise;
    }

    /**
     * Find a Project saved in the persistance with an id
     * @param anId the id
     * @return the project which have this id
     */
    public Project findProjectById(Long anId) {
        return entm.find(Project.class,anId);
    }

    /**
     * Find an Enterprise in the persistance with an id
     * @param anId the id
     * @return the Enterprise which have this id
     */
    public Enterprise findEnterpriseById(Long anId) {
        return entm.find(Enterprise.class,anId);
    }

    /**
     *
     * @return une liste de tous les projets
     */
    public List<Project> findAllProjects() {
        String query = "SELECT p FROM Project p JOIN FETCH p.enterprise" ;
        TypedQuery<Project> queryObj = entm.createQuery(query, Project.class);
        return queryObj.getResultList();
    }
}
