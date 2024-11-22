package pe.edu.i202224460.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @Id
    @Column(name = "Language")
    private String language;

    @Column(name = "IsOfficial")
    private String isOfficial;

    @Column(name = "Percentage")
    private Double percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code", nullable = false)
    private Country country;

    public CountryLanguage() {
    }

    public CountryLanguage(String language, String isOfficial, Double percentage, Country country) {
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
        this.country = country;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                ", language='" + language + '\'' +
                ", isOfficial='" + isOfficial + '\'' +
                ", percentage=" + percentage +
                ", country=" + country +
                '}';
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}