package test;

import org.junit.jupiter.api.Test;
import ru.documents.entity.Incoming;
import ru.documents.entity.Outgoing;
import ru.generate.RandomValue;

import static org.junit.jupiter.api.Assertions.*;

class OutgoingFactoryTest {

    @Test
    void create() {
        Incoming incoming = new Incoming();
        assertNotNull(incoming);
    }

    @Test
    void generateRandomPropertiesForDocument() {
        Outgoing document = new Outgoing();
        document.setDestination(RandomValue.generateFio());
        document.setDelivery(RandomValue.generateDelivery());
        assertNotNull(document.getDelivery());
        assertNotNull(document.getDestination());
        assertNotNull(document);
    }
}