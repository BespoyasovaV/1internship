package test;

import org.junit.jupiter.api.Test;
import ru.documents.entity.Incoming;
import ru.documents.exceptions.DocumentExistException;
import ru.documents.factory.IncomingFactory;

import static org.junit.jupiter.api.Assertions.*;

class IncomingFactoryTest {
    IncomingFactory incomingFactory = new IncomingFactory();
    Incoming document = new Incoming();
    @Test
    void generateRandomPropertiesForDocument() throws DocumentExistException {
        incomingFactory.generateRandomPropertiesForDocument();
        assertNotNull(document.getSender());
        assertNotNull(document.getDestination());
        assertNotNull(document.getOutgoingNumber());
        assertNotNull(document.getOutgoingDate());
        assertNotNull(document);
    }
}