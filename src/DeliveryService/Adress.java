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

    public String country;
    public String city;
    public int officeNumber;

    public Adress(String country, String city, int officeNumber) {
        this.country = country;
        this.city = city;
        this.officeNumber = officeNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", country, city, officeNumber);
    }
}
