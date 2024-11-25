package pe.edu.i202224460.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224460.entity.Country;

public class JPARemove {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Country country = em.find(Country.class, "XYZ");

        em.remove(country);

        em.getTransaction().commit();

        System.out.println("Eliminado :c pipipi");

    }
}