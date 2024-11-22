package pe.edu.i202224460.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224460.entity.City;
import pe.edu.i202224460.entity.Country;
import pe.edu.i202224460.entity.CountryLanguage;

import java.util.Arrays;

public class JPAPersist {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();

        // Un Pais Italo xd
        Country PaisItalo = new Country();
        PaisItalo.setCode("XYZ");
        PaisItalo.setCode2("XY");
        PaisItalo.setName("PaisItalo");
        PaisItalo.setContinent("Asia");
        PaisItalo.setRegion("Region xd");
        PaisItalo.setSurfaceArea(12345.67);
        PaisItalo.setPopulation(500000);
        PaisItalo.setGovernmentForm("Republica");
        PaisItalo.setLocalName("Local Italo");
        PaisItalo.setCapital(null);

        // Tres ciudades para mi Pais Italo
        City city1 = new City();
        city1.setName("CityOne");
        city1.setDistrict("Districto1");
        city1.setPopulation(100000);
        city1.setCountry(PaisItalo);

        City city2 = new City();
        city2.setName("CityTwo");
        city2.setDistrict("Districto2");
        city2.setPopulation(150000);
        city2.setCountry(PaisItalo);

        City city3 = new City();
        city3.setName("CityThree");
        city3.setDistrict("Districto3");
        city3.setPopulation(250000);
        city3.setCountry(PaisItalo);


        PaisItalo.setCities(Arrays.asList(city1, city2, city3));

        CountryLanguage language1 = new CountryLanguage();
        language1.setLanguage("Español");
        language1.setIsOfficial("T");
        language1.setPercentage(60.0);
        language1.setCountry(PaisItalo);

        CountryLanguage language2 = new CountryLanguage();
        language2.setLanguage("Ingles");
        language2.setIsOfficial("F");
        language2.setPercentage(40.0);
        language2.setCountry(PaisItalo);

        PaisItalo.setCountryLanguages(Arrays.asList(language1, language2));

        em.persist(PaisItalo);
        em.persist(city1);
        em.persist(city2);
        em.persist(city3);
        em.persist(language1);
        em.persist(language2);

        em.getTransaction().commit();
    }
}