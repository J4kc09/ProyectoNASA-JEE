/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.facade;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.codejava.modelo.PlanetaEditable;

/**
 *
 * @author acarr
 */
@Stateless
public class PlanetaEditableFacade extends AbstractFacade<PlanetaEditable> {

    @PersistenceContext(unitName = "ProyectoNASA-JEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlanetaEditableFacade() {
        super(PlanetaEditable.class);
    }
    public PlanetaEditable FindByNombrePlaneta(String nombrePlaneta) {
        List<PlanetaEditable> listaPlanetas = em.createQuery("select p from PlanetaEditable p where p.nombrePlaneta like ?1").setParameter(1, nombrePlaneta).getResultList();
        if (listaPlanetas.isEmpty()) {
            return null;
        }
        return listaPlanetas.get(0);
    }
}
