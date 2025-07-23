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
public class GetStringFromList {

    public static GetStringFromList create() {
        return new GetStringFromList();
    }

    public String getString(List<Item> items) {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(String.format("%s ", item.toString()));
        }
        
        return sb.toString();
    }
}
