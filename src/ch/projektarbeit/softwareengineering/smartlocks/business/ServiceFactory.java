package ch.projektarbeit.softwareengineering.smartlocks.business;

/**
 * Factory zur zentralen Erstellung von Service-Objekten.
 * Implementiert als Singleton.
 */
public class ServiceFactory {
    private static ServiceFactory instance;
    private final EinkaufswagenService einkaufswagenService;

    private ServiceFactory() {
        einkaufswagenService = new EinkaufswagenServiceImpl();
    }

    /**
     * Gibt die Singleton-Instanz der Factory zurück.
     * @return Instanz der ServiceFactory
     */
    public static ServiceFactory getInstance() {
        if (instance == null) {
            instance = new ServiceFactory();
        }
        return instance;
    }

    /**
     * Zugriff auf den EinkaufswagenService.
     * @return Instanz von EinkaufswagenService
     */
    public EinkaufswagenService getEinkaufswagenService() {
        return einkaufswagenService;
    }
}
