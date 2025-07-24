/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import DeliveryService.PackageList;
import DeliveryService.Package;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowList {

    public static ShowList create() {
        return new ShowList();
    }
    
    public void handle(PackageList packgList) {
        for(Package packg : packgList.getPackages()) {
            Message.create().show(String.format("%s\n", packg.toString()));
        }
    }
}
