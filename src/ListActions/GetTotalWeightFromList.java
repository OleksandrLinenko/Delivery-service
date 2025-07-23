/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListActions;

import DeliveryService.Item;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class GetTotalWeightFromList {

    public static GetTotalWeightFromList create() {
        return new GetTotalWeightFromList();
    }

    public float getTotalWeight(List<Item> items) {
        float weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }

        return weight;
    }
}
