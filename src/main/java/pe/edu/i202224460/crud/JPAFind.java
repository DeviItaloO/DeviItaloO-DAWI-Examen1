package pe.edu.i202224460.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224460.entity.Country;

public class JPAFind {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager em = emf.createEntityManager();

        Country peru = em.find(Country.class, "PER");

        System.out.println("País encontrado: " + peru.getName());

        peru.getCities().stream().filter( city -> city.getPopulation() > 700000)
                .forEach( city -> System.out.println("Ciudad: " + city.getName() + ", Población: " + city.getPopulation()));

    }
}