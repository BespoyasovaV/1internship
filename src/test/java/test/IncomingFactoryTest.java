package test;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Test;
import ru.documents.entity.Incoming;
import ru.generate.RandomValue;

import static org.junit.jupiter.api.Assertions.*;

class IncomingFactoryTest {

    @Test
    void create() {
        Incoming incoming = new Incoming();
        assertNotNull(incoming);
    }

    @Test
    void generateRandomPropertiesForDocument() {
        Incoming document = new Incoming();
        document.setSender(RandomValue.generateFio());
        document.setDestination(RandomValue.generateFio());
        document.setOutgoingNum(RandomUtils.nextInt(0, 35));
        document.setOutgoingDate(RandomValue.generateDate());
        assertNotNull(document.getDestination());
        assertNotNull(document.getSender());
        assertNotNull(document.getOutgoingDate());
        assertNotNull(document.getOutgoingNum());
        assertNotNull(document);
    }
}