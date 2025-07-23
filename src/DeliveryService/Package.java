/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryService;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class Package {

    private int packageNumber;
    private float weight;
    private Adress sender;
    private Adress receiver;
    private PackageItems items = new PackageItems();

    public Package(int packageNumber, float weight, Adress sender, Adress receiver, PackageItems items) {
        this.packageNumber = packageNumber;
        this.weight = weight;
        this.sender = sender;
        this.receiver = receiver;
        this.items = items;
    }

    public int getPackageNumber() {
        return packageNumber;
    }

    public float getWeight() {
        return weight;
    }

    public Adress getSender() {
        return sender;
    }

    public Adress getReceiver() {
        return receiver;
    }

    public PackageItems getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d Sender: %s, Receiver: %s total package weight: %.3f\n", packageNumber, sender.toString(), receiver.toString(), items.getTotalWeight()));
        sb.append("Items list: ");
        sb.append(items.getString());

        return sb.toString();
    }

}
