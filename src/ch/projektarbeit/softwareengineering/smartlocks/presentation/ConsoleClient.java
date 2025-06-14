package ch.projektarbeit.softwareengineering.smartlocks.presentation;

import ch.projektarbeit.softwareengineering.smartlocks.business.EinkaufswagenService;
import ch.projektarbeit.softwareengineering.smartlocks.business.ServiceFactory;
import ch.projektarbeit.softwareengineering.smartlocks.persistence.EinkaufswagenEntity;



/**
 * Einstiegspunkt der Anwendung.
 * Erstellt Testdaten und zeigt den Status von Einkaufswagen auf der Konsole an.
 */
public class ConsoleClient {

    /**
     * Führt den Endbenutzertest durch, indem Einkaufswagen erstellt, verändert und angezeigt werden.
     *
     * @param args nicht verwendet
     */
    public static void main(String[] args) {
    	EinkaufswagenService service = ServiceFactory.getInstance().getEinkaufswagenService();
  
        EinkaufswagenEntity wagen1 = new EinkaufswagenEntity("W1", "GESPERRT");
        EinkaufswagenEntity wagen2 = new EinkaufswagenEntity("W2", "GESPERRT");

        service.speichern(wagen1);
        service.speichern(wagen2);

        service.entsperren("W1");

        for (EinkaufswagenEntity wagen : service.getAlle()) {
            System.out.println(wagen);
        }
    }
}
