package ControllerLayer;

import ModelLayer.Firma;
import ViewLayer.FirmaView;

import java.util.ArrayList;

public class FirmaController {
    private final Firma model;
    private final FirmaView view;

    private final ArrayList<Firma> arr = new ArrayList<Firma>();

    public FirmaController(Firma model, FirmaView view) {
        this.model = model;
        this.view = view;
    }

    public void setFirmaName(String name) {
        model.setName(name);
    }

    public String getFirmaName() {
        return model.getName();
    }

    public void setFirmaAdresse(String adresse) {
        model.setAdresse(adresse);
    }

    public String getFirmaAdresse() {
        return model.getAdresse();
    }

    public void setFirmaTelefon(String telefon) {
        model.setTelefon(telefon);
    }

    public String getFirmaTelefon() {
        return model.getTelefon();
    }

    public void setFirmaEmail(String email) {
        model.setEmail(email);
    }

    public String getFirmaEmail() {
        return model.getEmail();
    }

    public void setFirmaWebsite(String website) {
        model.setWebsite(website);
    }

    public String getFirmaWebsite() {
        return model.getWebsite();
    }

    public void updateView(){
        view.printFirmaDetails(model.getName(), model.getAdresse(), model.getTelefon(), model.getEmail(), model.getWebsite());
    }

    public void add(Firma firma){
        arr.add(firma);
    }

    public void remove(Firma firma){
        arr.remove(firma);
    }

    public void update(Firma firma){
        arr.set(arr.indexOf(firma), firma);
    }

    public boolean find(Firma firma){
        return arr.contains(firma);
    }
    public void printAll(){
        for (Firma firma : arr) {
            System.out.println(firma.getName());
            System.out.println(firma.getAdresse());
            System.out.println(firma.getTelefon());
            System.out.println(firma.getEmail());
            System.out.println(firma.getWebsite());
        }
    }



}
