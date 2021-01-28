package ru.documents.factory;

import ru.documents.Document;
import ru.documents.Incoming;

/**
 * класс создает документ Incoming, но без полей родителя
 */
public class IncomingFactory extends AbstractFactory<Incoming> implements Conclusion,DocumentCreate<Incoming> {
    @Override
    public Incoming create() {
        return new Incoming();
    }

    @Override
    public Incoming generateRandomPropertiesForDocument(Incoming document) {
        getDocument(document);
        document.setSender(generateFio());
        document.setDestination(generateFio());
        document.setOutgoing_num(generateIshNum());
        document.setOutgoing_date(generateDate());
        return document;
    }



    @Override
    public String toString(Document document) {
        document=(Incoming) document;
        return null;
    }
}
