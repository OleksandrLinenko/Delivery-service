/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

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
        Message.create().show("4. Collect and send a packag\n");
        Message.create().show("5. Receive one of your packages\n");
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

                break;
            default:
                Message.create().show("Undefined option");
        }

        return false;
    }
}
