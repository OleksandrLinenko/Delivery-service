/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryService;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class Application {

    private static Application app = new Application();
    private PackageList SendingPackages;
    private PackageList GettingPackages;

    private Application() {

    }

    public static Application getInstance() {
        return app;
    }

    public PackageList getSendingPackages() {
        return SendingPackages;
    }

    public PackageList getGettingPackages() {
        return GettingPackages;
    }
}
