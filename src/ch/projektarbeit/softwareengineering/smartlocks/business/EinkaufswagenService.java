package ch.projektarbeit.softwareengineering.smartlocks.business;

import ch.projektarbeit.softwareengineering.smartlocks.persistence.EinkaufswagenEntity;
import java.util.Collection;

/**
 * Schnittstelle für die digitale Steuerung von Einkaufswagen.
 */
public interface EinkaufswagenService {
    /**
     * Entsperrt einen Wagen.
     * @param wagenId ID des zu entsperrenden Wagens
     */
    void entsperren(String wagenId);

    /**
     * Sperrt einen Wagen.
     * @param wagenId ID des zu sperrenden Wagens
     */
    void sperren(String wagenId);
    
    void speichern(EinkaufswagenEntity wagen);
    Collection<EinkaufswagenEntity> getAlle();

}
