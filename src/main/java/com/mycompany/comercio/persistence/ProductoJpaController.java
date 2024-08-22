package com.mycompany.comercio.persistence;

import com.mycompany.comercio.model.Producto;
import com.mycompany.comercio.model.ProductoId;
import com.mycompany.comercio.persistence.exceptions.NonexistentEntityException;
import com.mycompany.comercio.persistence.exceptions.PreexistingEntityException;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

public class ProductoJpaController implements Serializable {

    public ProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ProductoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("ComercioPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            if (findProducto(producto.getNombre(), producto.getMarca()) != null) {
                throw new PreexistingEntityException("Producto " + producto + " already exists.");
            }
            em.persist(producto);
            em.getTransaction().commit();
        } catch (PreexistingEntityException ex) {
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            producto = em.merge(producto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                ProductoId id = new ProductoId(producto.getNombre(), producto.getMarca());
                if (findProducto(id.getNombre(), id.getMarca()) == null) {
                    throw new NonexistentEntityException("The producto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String nombre, String marca) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto;
            try {
                ProductoId id = new ProductoId(nombre, marca);
                producto = em.getReference(Producto.class, id);
                producto.getNombre();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The producto with id " + nombre + " and marca " + marca + " no longer exists.", enfe);
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        return findProductoEntities(true, -1, -1);
    }

    public List<Producto> findProductoEntities(int maxResults, int firstResult) {
        return findProductoEntities(false, maxResults, firstResult);
    }

    private List<Producto> findProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
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

    public Producto findProducto(String nombre, String marca) {
        EntityManager em = getEntityManager();
        try {
            ProductoId id = new ProductoId(nombre, marca);
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Producto> findProductosByNombre(String nombreParcial) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT p FROM Producto p WHERE p.nombre LIKE :nombreParcial");
            query.setParameter("nombreParcial", "%" + nombreParcial + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    public List<Producto> findProductosByCategoria(String categoria) {
    EntityManager em = getEntityManager();
    try {
        Query query = em.createQuery("SELECT p FROM Producto p WHERE p.categoria = :categoria");
        query.setParameter("categoria", categoria);
        return query.getResultList();
    } finally {
        em.close();
    }
}

    public List<String> findDistinctCategorias() {
    EntityManager em = getEntityManager();
    try {
        TypedQuery<String> query = em.createQuery("SELECT DISTINCT p.categoria FROM Producto p", String.class);
        return query.getResultList();
    } finally {
        em.close();
    }
}

}
