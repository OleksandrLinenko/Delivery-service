/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryService;

import UI.Ask;
import UI.ErrorMessage;
import UI.Message;
import java.util.Random;

/**
 *
 * @author oleksandrlinenko
 */
public class Application {

    private static Application app = new Application();
    private PackageList SendingPackages = new PackageList();
    private PackageList GettingPackages = new PackageList();

    private Application() {

    }

    public static Application getInstance() {
        return app;
    }

    public PackageList getSendingPackages() {
        return SendingPackages;
    }

    public PackageList getGettingPackages() {
        return GettingPackages;
    }

    public Package newPackage() {
        boolean correct = false;
        do {
            try {
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

                Message.create().show("Adding items to the package: ");
                PackageItems items = new PackageItems();
                boolean endAsk = false;
                do {
                    String itemName = Ask.create().askString("Set item name: ");
                    String category = Ask.create().askString("Set item category: ");
                    float weight = Ask.create().askFloat("Set item weight: ");
                    items.addItem(new Item(packageNumber, itemName, category, weight));
                    String wantCon = Ask.create().askString("Pres Enter to continue adding items");
                    if (!wantCon.equals("")) {
                        endAsk = true;
                    }
                } while (!endAsk);

                float totalWeight = items.getTotalWeight();
                correct = true;
                return new Package(packageNumber, totalWeight, sender, receiver, State.INWWAY, items);
            } catch (Exception ex) {
                ErrorMessage.create().show(ex.getMessage());
            }
        } while (!correct);

        return null;
    }
}
