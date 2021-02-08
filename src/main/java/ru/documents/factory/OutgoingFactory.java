package ru.documents.factory;

import ru.documents.entity.Outgoing;
import ru.documents.exceptions.DocumentExistException;
import ru.generate.Delivery;
import ru.generate.ProgramCollections;

/**
 * Класс создает  документ Outgoing, но без полей родителя
 *
 * @author BespoyasovaV
 */
public class OutgoingFactory extends AbstractFactory<Outgoing> implements DocumentCreate<Outgoing> {
    /**
     * {@inheritDoc}
     */
    @Override
    public Outgoing generateRandomPropertiesForDocument() throws DocumentExistException {
        Outgoing document = new Outgoing();
        generateRandomProperties(document);
        document.setDestination(generateListMeaning(ProgramCollections.listFio));
        document.setDelivery((Delivery) generateEnum(Delivery.values()));
        return document;
    }
}

