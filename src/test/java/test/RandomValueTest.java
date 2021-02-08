package test;

import org.junit.jupiter.api.Test;
import ru.documents.exceptions.DocumentExistException;
import ru.generate.Delivery;
import ru.generate.ProgramCollections;
import ru.generate.RandomValue;

import static org.junit.jupiter.api.Assertions.*;

class RandomValueTest {

    @Test
    void generateRandomNumber() throws DocumentExistException {
        assertNotNull( RandomValue.generateRandomNumber(8));
    }

    @Test
    void generateListMeaning() {
        assertNotNull(RandomValue.generateListMeaning(ProgramCollections.wordListOne));
    }

    @Test
    void generateDelivery() {
        assertNotNull(RandomValue.generateEnum(Delivery.values()));
    }

    @Test
    void generateDate() {
        assertNotNull(RandomValue.generateDate());
    }
}