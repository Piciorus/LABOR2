package ModelLayer;

public class Firma {
    private String name;
    private String adresse;
    private String telefon;
    private String email;
    private String website;

    public Firma(String name, String adresse, String telefon, String email, String website) {
        this.name = name;
        this.adresse = adresse;
        this.telefon = telefon;
        this.email = email;
        this.website = website;
    }
    public Firma() {

    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public String getName() {
        return name;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getTelefon() {
        return telefon;
    }
    public String getEmail() {
        return email;
    }
    public String getWebsite() {
        return website;
    }

    public void printFirmaDetails(String name, String adresse, String telefon, String email, String website) {

    }
}
