package ourbusinnessproject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PartnershipService {
    @PersistenceContext
    private EntityManager entm;

    private Partnership partnership;

    public Partnership newPartnership(Project aproject, Enterprise apartnerEnterprise) {
        Partnership apartnership = new Partnership();
        apartnership.setCreationDate(new Date());
        apartnership.setProject(aproject);
        apartnership.setEnterprise(apartnerEnterprise);
        entm.persist(apartnership);
        entm.flush();
        return apartnership;
    }

    public Partnership findPartnershipById(Object id) {
        return entm.find(Partnership.class,id);
    }


    public void remove(Partnership partnership) {
        entm.remove(partnership);
    }
}
