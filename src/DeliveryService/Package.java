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
    private Sender sender;
    private Receiver receiver;
    private List<Item> items = new ArrayList();

    public Package(int packageNumber, float weight, Sender sender, Receiver receiver, List<Item> items) {
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

    public Sender getSender() {
        return sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public List<Item> getItems() {
        return items;
    }

    public float getTotalWeight() {
        float totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d %.3f Sender: %s, Receiver: %s total package weight: %.3f\n", packageNumber, weight, sender.toString(), receiver.toString(), getTotalWeight()));
        sb.append("Items list: ");
        for (Item item : items) {
            sb.append(String.format("%s ", item.toString()));
        }

        return sb.toString();
    }

}
