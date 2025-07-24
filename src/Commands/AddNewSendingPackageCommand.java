/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;

import DeliveryService.Adress;
import DeliveryService.Package;
import DeliveryService.Application;
import DeliveryService.Item;
import DeliveryService.PackageItems;
import DeliveryService.State;
import UI.Ask;
import java.util.Random;

/**
 *
 * @author oleksandrlinenko
 */
public class AddNewSendingPackageCommand {

    public static AddNewSendingPackageCommand create() {
        return new AddNewSendingPackageCommand();
    }

    public void handle() {
        Random random = new Random();
        int packageNumber = 100000 + random.nextInt(900000);

        String name = Ask.create().askString("Set sender name: ");
        String country = Ask.create().askString("Set sender country: ");
        String city = Ask.create().askString("Set sender city: ");
        String adress = Ask.create().askString("Set sender adress: ");

        Adress sender = new Adress(name, country, city, adress);
        String nameR = Ask.create().askString("Set receiver name: ");
        String countryR = Ask.create().askString("Set receiver country: ");
        String cityR = Ask.create().askString("Set receiver city: ");
        String adressR = Ask.create().askString("Set receiver adress: ");
        Adress receiver = new Adress(nameR, countryR, cityR, adressR);

        PackageItems items = new PackageItems();
        int itemsQuantity = Ask.create().askInt("Set items quantity: ");
        for (int i = 0; i < itemsQuantity; i++) {
            String itemName = Ask.create().askString("Set item name: ");
            String category = Ask.create().askString("Set item category: ");
            float weight = Ask.create().askFloat("Set item weight");
            items.addItem(new Item(itemName, category, weight));
        }

        float totalWeight = items.getTotalWeight();
        Application.getInstance().getSendingPackages().addPackage(new Package(packageNumber, totalWeight, sender, receiver, State.INWWAY, items));
    }
}
