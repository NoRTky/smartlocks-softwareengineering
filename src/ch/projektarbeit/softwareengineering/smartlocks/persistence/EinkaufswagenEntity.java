package ch.projektarbeit.softwareengineering.smartlocks.persistence;

/**
 * Repräsentiert ein Einkaufswagen-Objekt mit ID und Status.
 */
public class EinkaufswagenEntity {
    /**
     * Eindeutige Kennung des Wagens.
     */
    private String id;

    /**
     * Aktueller Status des Wagens (z. B. GESPERRT, ENTSPERRT).
     */
    private String status;

    /**
     * Erstellt ein neues Wagen-Objekt.
     *
     * @param id     die ID des Wagens
     * @param status der initiale Status
     */
    public EinkaufswagenEntity(String id, String status) {
        this.id = id;
        this.status = status;
    }

    /** @return ID des Wagens */
    public String getId() { return id; }

    /** @return aktueller Status */
    public String getStatus() { return status; }

    /**
     * Setzt den Status neu.
     * @param status neuer Status
     */
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Einkaufswagen{" + "id='" + id + '\'' + ", status='" + status + '\'' + '}';
    }
}
