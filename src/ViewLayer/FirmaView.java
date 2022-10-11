package ViewLayer;

import ControllerLayer.FirmaController;
import ModelLayer.Firma;

import java.util.Scanner;

public class FirmaView {
    public void printFirmaDetails(String name, String adresse, String telefon, String email, String website) {
        System.out.println("Firma: ");
        System.out.println("Name: " + name);
        System.out.println("Adresse: " + adresse);
        System.out.println("Telefon: " + telefon);
        System.out.println("Email: " + email);
        System.out.println("Website: " + website);
    }

    public void menu(){
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Print");
        System.out.println("5. Exit");
    }

}
