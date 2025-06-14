package ch.projektarbeit.softwareengineering.smartlocks.business;

import ch.projektarbeit.softwareengineering.smartlocks.persistence.*;
import java.util.Collection;


/**
 * Implementierung des EinkaufswagenService mit Zugriff auf das Repository.
 */
public class EinkaufswagenServiceImpl implements EinkaufswagenService {
    private final EinkaufswagenRepository repository;

    /**
     * Erstellt einen neuen Einkaufswagen-Service.
     */
    public EinkaufswagenServiceImpl() {
        this.repository = EinkaufswagenRepository.getInstance();
    }

    @Override
    public void entsperren(String wagenId) {
        EinkaufswagenEntity wagen = repository.findById(wagenId);
        if (wagen != null) {
            wagen.setStatus("ENTSPERRT");
        }
    }

    @Override
    public void sperren(String wagenId) {
        EinkaufswagenEntity wagen = repository.findById(wagenId);
        if (wagen != null) {
            wagen.setStatus("GESPERRT");
        }
    }
    
    @Override
    public void speichern(EinkaufswagenEntity wagen) {
        repository.save(wagen);
    }

    @Override
    public Collection<EinkaufswagenEntity> getAlle() {
        return repository.findAll();
    }

}
