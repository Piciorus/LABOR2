import ControllerLayer.FirmaController;
import ModelLayer.Firma;
import ViewLayer.FirmaView;

public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma("sdf", "sdfs", "sdfds", "sdfs", "sdfsd");
        System.out.println("Hello world!");
        Firma model = retriveFirmaFromDatabase();
        FirmaView view = new FirmaView();
        FirmaController controller = new FirmaController(model, view);
        controller.updateView();
        controller.add(firma);
        controller.printAll();

    }
    private static Firma retriveFirmaFromDatabase() {
        Firma firma = new Firma();
        firma.setName("Firma");
        firma.setAdresse("Adresse 1");
        firma.setTelefon("214124");
        firma.setEmail("adfads@gmail.cm");
        firma.setWebsite("www.firma");
        return firma;
    }
}