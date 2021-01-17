/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jt.hr.backend_app;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless(mappedName = "BeanSesiune")
@LocalBean
public class BeanSesiune implements IBeanSesiune{

    @PersistenceContext EntityManager em;

    @Override
    public List<String> getRecords() {
        return (List<String>)em.createNamedQuery("Candidat.findAll").getResultList();
    }
    
    @Override
    public int getCount(){
        return (int)em.createNamedQuery("Candidat.count").getFirstResult();
    }
}
