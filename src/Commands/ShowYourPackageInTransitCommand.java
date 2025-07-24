/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;

import DeliveryService.Application;
import UI.ShowList;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowYourPackageInTransitCommand {

    public static ShowYourPackageInTransitCommand create() {
        return new ShowYourPackageInTransitCommand();
    }

    public void handle() {
        ShowList.create().handle(Application.getInstance().getGettingPackages().getListInWay());
    }
}
