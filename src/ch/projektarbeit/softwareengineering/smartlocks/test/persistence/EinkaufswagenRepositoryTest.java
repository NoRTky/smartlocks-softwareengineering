package ch.projektarbeit.softwareengineering.smartlocks.test.persistence;

import ch.projektarbeit.softwareengineering.smartlocks.persistence.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EinkaufswagenRepositoryTest {

    EinkaufswagenRepository repo;

    @BeforeEach
    void setUp() {
        repo = EinkaufswagenRepository.getInstance();
        repo.findAll().clear(); // sicherstellen, dass die Daten leer sind
    }

    @Test
    void testSaveAndFindById() {
        EinkaufswagenEntity wagen = new EinkaufswagenEntity("T1", "GESPERRT");
        repo.save(wagen);

        EinkaufswagenEntity result = repo.findById("T1");
        assertNotNull(result);
        assertEquals("GESPERRT", result.getStatus());
    }

    @Test
    void testFindAll() {
        repo.save(new EinkaufswagenEntity("A", "GESPERRT"));
        repo.save(new EinkaufswagenEntity("B", "ENTSPERRT"));

        Collection<EinkaufswagenEntity> alle = repo.findAll();
        assertEquals(2, alle.size());
    }
}
