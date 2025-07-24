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
public class ShowPackageSentToPersonCommand {

    public static ShowPackageSentToPersonCommand create() {
        return new ShowPackageSentToPersonCommand();
    }

    public void handle() {
        ShowList.create().handle(Application.getInstance().getSendingPackages());
    }
}
