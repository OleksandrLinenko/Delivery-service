/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryService;

/**
 *
 * @author oleksandrlinenko
 */
public class Receiver {

    private String name;
    private Adress receiveAdress;

    public Receiver(String name, Adress receivAdress) {
        this.name = name;
        this.receiveAdress = receivAdress;
    }

    public String getName() {
        return name;
    }

    public Adress getReceiveAdress() {
        return receiveAdress;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, receiveAdress.toString());
    }
}
