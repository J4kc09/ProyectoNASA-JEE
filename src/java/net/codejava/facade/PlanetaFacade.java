/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.codejava.modelo.Planeta;

/**
 *
 * @author acarr
 */
@Stateless
public class PlanetaFacade extends AbstractFacade<Planeta> {

    @PersistenceContext(unitName = "ProyectoNASA-JEEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlanetaFacade() {
        super(Planeta.class);
    }
    
}
