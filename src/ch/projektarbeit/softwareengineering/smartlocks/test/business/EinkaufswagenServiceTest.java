package ch.projektarbeit.softwareengineering.smartlocks.test.business;

import ch.projektarbeit.softwareengineering.smartlocks.business.*;
import ch.projektarbeit.softwareengineering.smartlocks.persistence.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EinkaufswagenServiceTest {

    EinkaufswagenService service;
    EinkaufswagenRepository repo;

    @BeforeEach
    void setUp() {
        service = new EinkaufswagenServiceImpl();
        repo = EinkaufswagenRepository.getInstance();
        repo.findAll().clear();
    }

    @Test
    void testEntsperren() {
        EinkaufswagenEntity wagen = new EinkaufswagenEntity("X1", "GESPERRT");
        repo.save(wagen);

        service.entsperren("X1");
        assertEquals("ENTSPERRT", repo.findById("X1").getStatus());
    }

    @Test
    void testSperren() {
        EinkaufswagenEntity wagen = new EinkaufswagenEntity("X2", "ENTSPERRT");
        repo.save(wagen);

        service.sperren("X2");
        assertEquals("GESPERRT", repo.findById("X2").getStatus());
    }
}
