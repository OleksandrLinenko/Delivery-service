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

    private String name;
    private String category;
    private float weight;

    public Item(String name, String category, float weight) {
        if (name.isEmpty() || category.isEmpty()) {
            throw new IllegalArgumentException("One of input filed is empty");
        }

        if (weight <= 0) {
            throw new IllegalArgumentException("Weight can't be 0 or less");
        }
        this.name = name;
        this.category = category;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Category: %s, Weight: %.2f", name, category, weight);
    }
}
