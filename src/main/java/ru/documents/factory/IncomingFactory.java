package ru.documents.factory;

import org.apache.commons.lang3.RandomUtils;
import ru.documents.entity.Incoming;
import ru.documents.exceptions.DocumentExistException;
import ru.generate.ProgramCollections;

/**
 * Класс создает документ Incoming, но без полей родителя
 *
 * @author BespoyasovaV
 */
public class IncomingFactory extends AbstractFactory<Incoming> implements DocumentCreate<Incoming> {
    public static final int OUTGOING_NUMBER_AFTER=35;
    public static final int OUTGOING_NUMBER_BEFORE=0;
    /**
     * {@inheritDoc}
     */
    @Override
    public Incoming generateRandomPropertiesForDocument() throws DocumentExistException {
        Incoming document = new Incoming();
        generateRandomProperties(document);
        document.setSender(generateListMeaning(ProgramCollections.listFio));
        document.setDestination(generateListMeaning(ProgramCollections.listFio));
        document.setOutgoingNumber(RandomUtils.nextInt(OUTGOING_NUMBER_BEFORE,OUTGOING_NUMBER_AFTER));
        document.setOutgoingDate(generateDate());
        return document;
    }
}

