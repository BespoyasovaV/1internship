package ru.documents.factory;

import ru.documents.entity.Outgoing;

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
    public Outgoing create() {
        return new Outgoing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Outgoing generateRandomPropertiesForDocument(Outgoing document) {
        getDocument(document);
        document.setDestination(generateFio());
        document.setDelivery(generateDelivery());
        return document;
    }
}
