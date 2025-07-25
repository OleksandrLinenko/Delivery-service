/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;

import DeliveryService.Application;

/**
 *
 * @author oleksandrlinenko
 */
public class AddNewSendingPackageCommand {

    public static AddNewSendingPackageCommand create() {
        return new AddNewSendingPackageCommand();
    }

    public void handle() {
        Application.getInstance().getSendingPackages().addPackage(Application.getInstance().newPackage());
    }
}
