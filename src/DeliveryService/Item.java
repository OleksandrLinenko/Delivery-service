/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryService;

/**
 *
 * @author oleksandrlinenko
 */
public class Item {

    private String category;
    private float weight;

    public Item(String category, float weight) {
        this.category = category;
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Category: %s, weight: %.2f", category, weight);
    }
}
