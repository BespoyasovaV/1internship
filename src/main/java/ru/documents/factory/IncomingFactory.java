package ru.documents.factory;

import org.apache.commons.lang3.RandomUtils;
import ru.documents.entity.Incoming;

/**
 * Класс создает  документ Incoming, но без полей родителя
 *
 * @author BespoyasovaV
 */
public class IncomingFactory extends AbstractFactory<Incoming> implements DocumentCreate<Incoming> {
    /**
     * {@inheritDoc}
     */
    @Override
    public Incoming create() {
        return new Incoming();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Incoming generateRandomPropertiesForDocument(Incoming document) {
        getDocument(document);
        document.setSender(generateFio());
        document.setDestination(generateFio());
        document.setOutgoingNum(RandomUtils.nextInt(0, 35));
        document.setOutgoingDate(generateDate());
        return document;
    }
}
