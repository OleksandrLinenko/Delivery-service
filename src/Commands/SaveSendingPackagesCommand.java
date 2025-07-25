/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;

import DeliveryService.Application;
import DeliveryService.Data;
import UI.Ask;
import UI.ErrorMessage;
import java.io.IOException;

/**
 *
 * @author oleksandrlinenko
 */
public class SaveSendingPackagesCommand {

    public static SaveSendingPackagesCommand create() {
        return new SaveSendingPackagesCommand();
    }

    public void handle() {
        try {
            Data.create().saveData(Ask.create().askString("Set path to save file: "), Application.getInstance().getSendingPackages());
        } catch (IOException ex) {
            ErrorMessage.create().show(ex.getMessage());
        }
    }
}
