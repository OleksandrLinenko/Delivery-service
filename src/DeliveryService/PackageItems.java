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
public class PackageItems {

    private List<Item> items = new ArrayList();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getTotalWeight() {
        float weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }

        return weight;
    }

    public String getString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(String.format("%s ", item.toString()));
        }

        return sb.toString();
    }
}
