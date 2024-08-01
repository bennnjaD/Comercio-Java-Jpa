/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comercio.persistencia;

import com.mycompany.comercio.logica.Ganancia;
import com.mycompany.comercio.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author USUARIO
 */
public class GananciaJpaController implements Serializable {

    public GananciaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public GananciaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("ComercioPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ganancia ganancia) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ganancia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Ganancia ganancia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ganancia = em.merge(ganancia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = ganancia.getId();
                if (findGanancia(id) == null) {
                    throw new NonexistentEntityException("The ganancia with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ganancia ganancia;
            try {
                ganancia = em.getReference(Ganancia.class, id);
                ganancia.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ganancia with id " + id + " no longer exists.", enfe);
            }
            em.remove(ganancia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Ganancia> findGananciaEntities() {
        return findGananciaEntities(true, -1, -1);
    }

    public List<Ganancia> findGananciaEntities(int maxResults, int firstResult) {
        return findGananciaEntities(false, maxResults, firstResult);
    }

    private List<Ganancia> findGananciaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ganancia.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Ganancia findGanancia(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ganancia.class, id);
        } finally {
            em.close();
        }
    }

    public int getGananciaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ganancia> rt = cq.from(Ganancia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    List<Ganancia> findGananciasByFecha(String fecha) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT v FROM Ganancia v WHERE v.fecha = :fecha");
            query.setParameter("fecha", LocalDate.parse(fecha));
            return query.getResultList();
        } finally {
            em.close();
        }        
    }

    List<Ganancia> traerGananciasDelMes() {
        EntityManager em = getEntityManager();
        try {
            LocalDate inicioMes = YearMonth.now().atDay(1);
            LocalDate finMes = YearMonth.now().atEndOfMonth();
            Query query = em.createQuery("SELECT g FROM Ganancia g WHERE g.fecha BETWEEN :inicioMes AND :finMes");
            query.setParameter("inicioMes", inicioMes);
            query.setParameter("finMes", finMes);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
}
