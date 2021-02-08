package test;

import org.junit.jupiter.api.Test;
import ru.documents.entity.Outgoing;
import ru.documents.exceptions.DocumentExistException;
import ru.documents.factory.OutgoingFactory;

import static org.junit.jupiter.api.Assertions.*;

class OutgoingFactoryTest {
    OutgoingFactory outgoingFactory=new OutgoingFactory();
    Outgoing document = new Outgoing();
    @Test
    void generateRandomPropertiesForDocument() throws DocumentExistException {
        outgoingFactory.generateRandomPropertiesForDocument();
        assertNotNull(document.getDelivery());
        assertNotNull(document.getDestination());
        assertNotNull(document);
    }
}