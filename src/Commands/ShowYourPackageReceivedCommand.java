/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;

import DeliveryService.Application;
import DeliveryService.State;
import UI.ShowList;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowYourPackageReceivedCommand {
        public static ShowYourPackageReceivedCommand create() {
        return new ShowYourPackageReceivedCommand();
    }
    
    public void handle() {
        ShowList.create().handle(Application.getInstance().getGettingPackages().getListByState(State.RECEIVED));
    }
}
