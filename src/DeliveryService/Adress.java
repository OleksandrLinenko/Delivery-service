/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryService;

/**
 *
 * @author oleksandrlinenko
 */
public class Adress {

    public String name;
    public String country;
    public String city;
    public String adress1;

    public Adress(String name, String country, String city, String adress1) {
        if(name.isEmpty() || country.isEmpty() || city.isEmpty() || adress1.isEmpty()) {
            throw new IllegalArgumentException("Illegal argument");
        }
        this.name = name;
        this.country = country;
        this.city = city;
        this.adress1 = adress1;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAdress1() {
        return adress1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", name, country, city, adress1);
    }
}
