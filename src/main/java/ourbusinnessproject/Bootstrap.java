package ourbusinnessproject;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Bootstrap {

    private final InitializationService initS;

    @Autowired
    public Bootstrap(InitializationService initializationService) {
        initS = initializationService;
    }

    @PostConstruct
    public void init() {
        try {
            initS.initProjects();
        } catch (RuntimeException re){
            System.out.println("erreur bootstrap");
        }

    }

    public InitializationService getInitializationService() {
        return initS;
    }
}
