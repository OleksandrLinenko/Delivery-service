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
public class PackageList {

    private List<Package> packages = new ArrayList();

    public List<Package> getPackages() {
        return packages;
    }

    public PackageList getListInWay() {
        PackageList result = new PackageList();
        for (Package packg : packages) {
            if (inWay(packg)) {
                result.addPackage(packg);
            }
        }
        
        return result;
    }

    public PackageList getListReceived() {
        PackageList result = new PackageList();
        for (Package packg : packages) {
            if (!inWay(packg)) {
                result.addPackage(packg);
            }
        }
        
        return result;
    }

    public void addPackage(Package pacgk) {
        packages.add(pacgk);
    }

    public boolean inWay(Package packg) {
        if (packg.getState().equals(State.INWWAY)) {
            return true;
        }

        return false;
    }

}
