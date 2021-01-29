package ru.documents.factory;

import org.apache.commons.lang3.RandomUtils;
import ru.documents.DocumentExistException;
import ru.documents.entity.Incoming;

/**
 * Класс создает документ Incoming, но без полей родителя
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
    public Incoming generateRandomPropertiesForDocument(Incoming document) throws DocumentExistException {
        getDocument(document);
        document.setSender(generateFio());
        document.setDestination(generateFio());
        document.setOutgoing_num(RandomUtils.nextInt(0, 35));
        document.setOutgoing_date(generateDate());
        return document;
    }
}
