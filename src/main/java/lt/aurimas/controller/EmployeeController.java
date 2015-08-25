package lt.aurimas.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import lt.aurimas.model.Employee;

@Component
public class EmployeeController {
    @PersistenceContext
    private EntityManager em;
 
    public EntityManager getEm() {
        return em;
    }
 
    public void setEm(EntityManager em) {
        this.em = em;
    }
 
    @Transactional
    public void register(Employee emp) {
        // Save employee
        this.em.persist(emp);
    }
}
