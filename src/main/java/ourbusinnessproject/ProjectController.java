package ourbusinnessproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
@RestController
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    EnterpriseProjectService eps;

    public ProjectController(EnterpriseProjectService enterpriseProjectService) {
        eps = enterpriseProjectService;
    }

    @RequestMapping("/projects")
    public List<Project> findAllProjectsWithEnterprises() {
        return eps.findAllProjects();
    }
}
