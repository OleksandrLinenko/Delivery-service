/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import Commands.AddNewSendingPackageCommand;
import Commands.FindPackageCommand;
import Commands.SaveSendingPackagesCommand;
import Commands.ShowPackageSentToPersonCommand;
import Commands.ShowYourPackageInTransitCommand;
import Commands.ShowYourPackageReceivedCommand;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author oleksandrlinenko
 */
public class MainMenu {

    private static Scanner sc = new Scanner(System.in);

    public static MainMenu create() {
        return new MainMenu();
    }

    public void show() {
        boolean endProgram = false;
        do {
            menu();
            int option = getOption();
            endProgram = doOption(option);
        } while (!endProgram);
    }

    public static void menu() {
        Message.create().show("\nDelivery service\n");
        Message.create().show("1. View packages sent to another person;\n");
        Message.create().show("2. View your packages that are still in transit\n");
        Message.create().show("3. View your received packages\n");
        Message.create().show("4. Collect and send a package\n");
        Message.create().show("5. Receive one of your packages\n");
        Message.create().show("6. Save sending packages to file\n");
        Message.create().show("0. End of program\n");
    }

    public static int getOption() {
        Message.create().show("Pick the option: ");
        int option;
        try {
            option = sc.nextInt();
        } catch (InputMismatchException ex) {
            return - 1;
        }

        return option;
    }

    public static boolean doOption(int option) {
        switch (option) {
            case 0:
                return true;
            case 1:
                showPackageSentToPerson();
                break;
            case 2:
                showYourPackageInTransit();
                break;
            case 3:
                showYourPackageReceived();
                break;
            case 4:
                addNewSendingPackage();
                break;
            case 5:
                findPackage();
                break;
            case 6:
                saveSendingPackages();
                break;
            default:
                Message.create().show("Undefined option");
        }

        return false;
    }
    
    public static void showPackageSentToPerson() {
        ShowPackageSentToPersonCommand.create().handle();
    }
    
    public static void showYourPackageInTransit() {
        ShowYourPackageInTransitCommand.create().handle();
    }
    
    public static void showYourPackageReceived() {
        ShowYourPackageReceivedCommand.create().handle();
    }
    
    public static void addNewSendingPackage() {
        AddNewSendingPackageCommand.create().handle();
    }
    
    public static void findPackage() {
        FindPackageCommand.create().handle();
    }
    
    public static void saveSendingPackages() {
        SaveSendingPackagesCommand.create().handle();
    }
}
