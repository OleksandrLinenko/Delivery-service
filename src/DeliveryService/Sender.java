/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryService;

/**
 *
 * @author oleksandrlinenko
 */
public class Sender {

    private String name;
    private Adress deliveryAdress;

    public Sender(String name, Adress deliveryAdress) {
        this.name = name;
        this.deliveryAdress = deliveryAdress;
    }

    public String getName() {
        return name;
    }

    public Adress getReceiveAdress() {
        return deliveryAdress;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, deliveryAdress.toString());
    }
}
