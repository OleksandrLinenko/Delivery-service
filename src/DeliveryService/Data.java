/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author oleksandrlinenko
 */
public class Data {

    public static Data create() {
        return new Data();
    }

    public void saveData(String path) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)))) {
            for(Package packg : Application.getInstance().getGettingPackages().getPackages()) {
                bw.write(String.format("%d,%.3f,%s,%s,%s,%s,%s,%s,%s,%s,%s\n", packg.getPackageNumber(), packg.getItems().getTotalWeight(), packg.getState(),
                packg.getSender().getName(), packg.getSender().getCountry(), packg.getSender().getCity(), packg.getSender().getAdress1(),
                packg.getReceiver().getName(), packg.getReceiver().getCountry(), packg.getReceiver().getCity(), packg.getReceiver().getAdress1()));  
                PackageItems pi = packg.getItems();
                for(Item item : pi.getItems()) {
                    bw.write(String.format("%s,%s,%.3f", item.getName(), item.getCategory(), item.getWeight()));
                }
            }
        } catch(IOException ex) {
            throw new IOException("Error while writing data to file");
        }
    }
}
