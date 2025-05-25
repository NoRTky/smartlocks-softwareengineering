package ch.projektarbeit.softwareengineering.smartlocks.business;

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
}
