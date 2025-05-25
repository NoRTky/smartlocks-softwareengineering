package ch.projektarbeit.softwareengineering.smartlocks.presentation;

import ch.projektarbeit.softwareengineering.smartlocks.business.*;
import ch.projektarbeit.softwareengineering.smartlocks.persistence.*;
import ch.projektarbeit.softwareengineering.smartlocks.business.ServiceFactory;



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
        EinkaufswagenRepository repo = EinkaufswagenRepository.getInstance();
        EinkaufswagenService service = ServiceFactory.getInstance().getEinkaufswagenService();


        EinkaufswagenEntity wagen1 = new EinkaufswagenEntity("W1", "GESPERRT");
        EinkaufswagenEntity wagen2 = new EinkaufswagenEntity("W2", "GESPERRT");

        repo.save(wagen1);
        repo.save(wagen2);

        service.entsperren("W1");

        for (EinkaufswagenEntity wagen : repo.findAll()) {
            System.out.println(wagen);
        }
    }
}
