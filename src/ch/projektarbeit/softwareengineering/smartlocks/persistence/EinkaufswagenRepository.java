package ch.projektarbeit.softwareengineering.smartlocks.persistence;

import java.util.*;

/**
 * Repository für die Speicherung und Abfrage von Einkaufswagen-Objekten (in-memory).
 * Implementiert das Singleton-Pattern.
 */
public class EinkaufswagenRepository {
    private static EinkaufswagenRepository instance;
    private final Map<String, EinkaufswagenEntity> datenbank = new HashMap<>();

    private EinkaufswagenRepository() {}

    /**
     * Gibt die Singleton-Instanz des Repositories zurück.
     * @return Instanz
     */
    public static EinkaufswagenRepository getInstance() {
        if (instance == null) {
            instance = new EinkaufswagenRepository();
        }
        return instance;
    }

    /**
     * Speichert oder überschreibt einen Einkaufswagen.
     * @param wagen der zu speichernde Wagen
     */
    public void save(EinkaufswagenEntity wagen) {
        datenbank.put(wagen.getId(), wagen);
    }

    /**
     * Sucht einen Wagen anhand der ID.
     * @param id die ID des Wagens
     * @return Wagenobjekt oder null
     */
    public EinkaufswagenEntity findById(String id) {
        return datenbank.get(id);
    }

    /**
     * Gibt alle gespeicherten Wagen zurück.
     * @return alle Wagen
     */
    public Collection<EinkaufswagenEntity> findAll() {
        return datenbank.values();
    }
}
