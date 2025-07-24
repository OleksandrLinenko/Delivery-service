/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;

import DeliveryService.Application;
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
        Message.create().show(Application.getInstance().getGettingPackages().findPackage(Ask.create().askInt("Set package ID-number: ")).toString());
    }
}
