/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryService;

/**
 *
 * @author oleksandrlinenko
 */
public class Package {

    private int packageNumber;
    private float weight;
    private Adress sender;
    private Adress receiver;
    private State state;
    private PackageItems items = new PackageItems();

    public Package(int packageNumber, float weight, Adress sender, Adress receiver, State state, PackageItems items) {
        this.packageNumber = packageNumber;
        this.weight = weight;
        this.sender = sender;
        this.receiver = receiver;
        this.state = state;
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

    public State getState() {
        return state;
    }

    public PackageItems getItems() {
        return items;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Package ID-Number: %d, Sender: %s, Receiver: %s, Total package weight: %.3f, State: %s\n", packageNumber, sender.toString(), receiver.toString(), items.getTotalWeight(), state.getState()));
        sb.append("Items list: ");
        sb.append(items.getString());

        return sb.toString();
    }

}
