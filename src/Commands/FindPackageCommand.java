/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;

import DeliveryService.Application;
import DeliveryService.Package;
import UI.Ask;
import UI.Message;

/**
 *
 * @author oleksandrlinenko
 */
public class FindPackageCommand {

    public static FindPackageCommand create() {
        return new FindPackageCommand();
    }

    public void handle() {
        Package pack = Application.getInstance().getGettingPackages().findPackage(Ask.create().askInt("Set package ID-number: "));
        if (pack != null) {
            Message.create().show(pack.toString());
        } else {
            Message.create().show("No package with this ID number");
        }
    }
}
