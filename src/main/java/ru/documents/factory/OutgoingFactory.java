package ru.documents.factory;

import ru.documents.Document;
import ru.documents.Outgoing;
import ru.documents.factory.AbstractFactory;
import ru.documents.factory.DocumentCreate;

/**
 * класс создает документ Outgoing, но без полей родителя
 */
public class OutgoingFactory extends AbstractFactory<Outgoing> implements  Conclusion,DocumentCreate<Outgoing>  {
    @Override
    public Outgoing create() {
        return new Outgoing();
    }

    @Override
    public Outgoing generateRandomPropertiesForDocument(Outgoing document) {
       getDocument(document);
        document.setDestination(generateFio());
        document.setDelivery(generateDelivery());
        return document;

    }

    @Override
    public String toString(Document document) {
        return null;
    }
}
