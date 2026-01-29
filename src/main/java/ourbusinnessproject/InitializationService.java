package ourbusinnessproject;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InitializationService {
    @Autowired
    private EnterpriseProjectService enterpriseProjectService;

    private Enterprise enterprise1;
    private Enterprise enterprise2;
    private Project project1;
    private Project project2;
    private Project project3;
    @Transactional
    public void initProjects() {
        enterprise1 =enterpriseProjectService.newEnterprise("Company & Co","Comp description","Paul Durand","paul@compco.com");
        enterprise2 =enterpriseProjectService.newEnterprise("Company & Co2","Comp description2","Paul Durand2","paul2@compco.com");
        project1 = enterpriseProjectService.newProject("p1", "p1 description", enterprise1);
        project2 =enterpriseProjectService.newProject("p2", "p2 description", enterprise2);
        project3 =enterpriseProjectService.newProject("p3", "p3 description", enterprise1);
    }

    @PostConstruct
    public Project getProject1E1() {
      return project1;
    }
    @PostConstruct
    public Project getProject1E2() {
        return project2;
    }
    @PostConstruct
    public Project getProject2E1() {
        return project3;
    }
    @PostConstruct
    public Enterprise getEnterprise1() {
        return enterprise1;
    }
    @PostConstruct
    public Enterprise getEnterprise2() {
        return enterprise2;
    }
}
